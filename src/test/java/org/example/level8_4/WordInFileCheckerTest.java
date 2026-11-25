package org.example.level8_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WordInFileCheckerTest {

    private final WordInFileChecker task = new WordInFileChecker();

    @TempDir
    Path dir;

    @Test
    void findsWholeWordInFile() {
        Path file = dir.resolve("search.txt");
        FileUtils.writeText(file, "The cat sat.\nA dog ran.");
        assertTrue(task.contains(file, "dog"));
        assertFalse(task.contains(file, "do"));
    }

    @ParameterizedTest
    @CsvSource({
            "concatenate the cat, cat, true",
            "concatenate, cat, false",
            "cat, cat, true",
            "'(cat)', cat, true",
            "Cat, cat, false"
    })
    void checksWordBoundaries(String text, String word, boolean expected) {
        assertEquals(expected, task.containsWord(text, word));
    }

    @Test
    void rejectsBlankWord() {
        assertThrows(IllegalArgumentException.class, () -> task.containsWord("text", " "));
    }
}
