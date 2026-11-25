package org.example.level8_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class WordsShufflerTest {

    private final WordsShuffler task = new WordsShuffler();

    @TempDir
    Path dir;

    @Test
    void keepsSeparatorsAndSameWords() {
        String text = "one, two three!\nfour $5";
        String result = task.shuffleWords(text, new Random(3));
        assertEquals(text.replaceAll("[\\p{L}\\p{N}]+", "#"), result.replaceAll("[\\p{L}\\p{N}]+", "#"));
        assertEquals(sortedWords(text), sortedWords(result));
    }

    @Test
    void rewritesFileInPlace() {
        Path file = dir.resolve("words.txt");
        FileUtils.writeText(file, "alpha beta gamma delta");
        String result = task.shuffle(file, new Random(1));
        assertEquals(result, FileUtils.readText(file));
        assertEquals(sortedWords("alpha beta gamma delta"), sortedWords(result));
    }

    @Test
    void textWithoutWordsIsUnchanged() {
        assertEquals("", task.shuffleWords("", new Random(1)));
        assertEquals(" .,", task.shuffleWords(" .,", new Random(1)));
    }

    private String sortedWords(String text) {
        String[] words = text.split("[^\\p{L}\\p{N}]+");
        Arrays.sort(words);
        return String.join(" ", words);
    }
}
