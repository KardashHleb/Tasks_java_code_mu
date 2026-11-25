package org.example.level8_10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class SentenceWordsShufflerTest {

    private final SentenceWordsShuffler task = new SentenceWordsShuffler();

    @TempDir
    Path dir;

    @Test
    void wordsStayInsideTheirSentence() {
        String text = "red green blue. one two three four! a b";
        String result = task.shuffleSentences(text, new Random(2));
        String[] original = text.split("[.!?]");
        String[] shuffled = result.split("[.!?]");
        assertEquals(original.length, shuffled.length);
        for (int i = 0; i < original.length; i++) {
            assertEquals(sortedWords(original[i]), sortedWords(shuffled[i]));
        }
        assertEquals(text.replaceAll("\\p{L}+", "#"), result.replaceAll("\\p{L}+", "#"));
    }

    @Test
    void writesResultToTargetFile() {
        Path source = dir.resolve("sentences.txt");
        Path target = dir.resolve("out/shuffled.txt");
        FileUtils.writeText(source, "Cats chase mice. Dogs chase cats.\n");
        String result = task.shuffle(source, target, new Random(4));
        assertEquals(result, FileUtils.readText(target));
        assertEquals(sortedWords("Cats chase mice"), sortedWords(result.split("\\.")[0]));
    }

    @Test
    void handlesEmptyTextAndPunctuationOnly() {
        assertEquals("", task.shuffleSentences("", new Random(1)));
        assertEquals("...!?", task.shuffleSentences("...!?", new Random(1)));
    }

    private String sortedWords(String sentence) {
        String[] words = sentence.strip().split("\\s+");
        Arrays.sort(words);
        return String.join(" ", words);
    }
}
