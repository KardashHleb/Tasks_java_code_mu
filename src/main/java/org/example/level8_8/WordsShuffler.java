package org.example.level8_8;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.example.common.FileUtils;

public class WordsShuffler {

    private static final Pattern WORD = Pattern.compile("[\\p{L}\\p{N}]+");

    /** Shuffles the words of the file in place and returns the new text. */
    public String shuffle(Path file) {
        return shuffle(file, new Random());
    }

    /** Same as {@link #shuffle(Path)} with a caller-supplied random generator. */
    public String shuffle(Path file, Random random) {
        String result = shuffleWords(FileUtils.readText(file), random);
        FileUtils.writeText(file, result);
        return result;
    }

    /**
     * Shuffles the words of the text while every separator (spaces, punctuation, line breaks) stays
     * exactly where it was: the words are collected, shuffled, and put back into the original word slots.
     */
    public String shuffleWords(String text, Random random) {
        List<String> words = new ArrayList<>();
        Matcher matcher = WORD.matcher(text);
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
