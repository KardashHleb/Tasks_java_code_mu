package org.example.level8_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class WordsParenthesesTest {

    private final WordsParentheses task = new WordsParentheses();

    @TempDir
    Path dir;

    @Test
    void wrapsWordsInFile() {
        Path source = dir.resolve("words.txt");
        Path target = dir.resolve("wrapped.txt");
        FileUtils.writeText(source, "one two\nthree");
        assertEquals("(one) (two)\n(three)", task.wrap(source, target));
        assertEquals("(one) (two)\n(three)", FileUtils.readText(target));
    }

    @Test
    void keepsRepeatedWhitespace() {
        assertEquals("  (a)\t\t(b)  ", task.wrap("  a\t\tb  "));
    }

    @Test
    void handlesEmptyText() {
        assertEquals("", task.wrap(""));
    }
}
