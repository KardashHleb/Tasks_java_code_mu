package org.example.level8_9;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.example.common.FileUtils;

public class SentenceWordsShuffler {

    private static final Pattern WORD = Pattern.compile("[\\p{L}\\p{N}]+");

    /** Shuffles the words inside each sentence of the source file and writes the result to the target file. */
    public String shuffle(Path source, Path target) {
        return shuffle(source, target, new Random());
    }

    /** Same as {@link #shuffle(Path, Path)} with a caller-supplied random generator. */
    public String shuffle(Path source, Path target, Random random) {
        String result = shuffleSentences(FileUtils.readText(source), random);
        FileUtils.writeText(target, result);
        return result;
    }

    /**
     * Splits the text into sentences at '.', '!' and '?' and shuffles the words within each sentence only;
     * words never move to another sentence, and punctuation and spacing stay in place.
     */
    public String shuffleSentences(String text, Random random) {
        StringBuilder result = new StringBuilder();
        int start = 0;
        for (int i = 0; i <= text.length(); i++) {
            boolean boundary = i == text.length() || isSentenceEnd(text.charAt(i));
            if (boundary) {
                result.append(shuffleWords(text.substring(start, i), random));
                if (i < text.length()) {
                    result.append(text.charAt(i));
                }
                start = i + 1;
            }
        }
        return result.toString();
    }

    private boolean isSentenceEnd(char current) {
        return current == '.' || current == '!' || current == '?';
    }

    private String shuffleWords(String sentence, Random random) {
        List<String> words = new ArrayList<>();
        Matcher matcher = WORD.matcher(sentence);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        Collections.shuffle(words, random);
        Iterator<String> shuffled = words.iterator();
        StringBuilder result = new StringBuilder();
        matcher.reset();
        while (matcher.find()) {
            matcher.appendReplacement(result, Matcher.quoteReplacement(shuffled.next()));
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
