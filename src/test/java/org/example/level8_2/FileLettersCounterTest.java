package org.example.level8_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.UncheckedIOException;
import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FileLettersCounterTest {

    private final FileLettersCounter task = new FileLettersCounter();

    @TempDir
    Path dir;

    @Test
    void countsOnlyLetters() {
        Path file = dir.resolve("letters.txt");
        FileUtils.writeText(file, "Hi there, 42 times!\n");
        assertEquals(12, task.count(file));
    }

    @Test
    void emptyFileHasNoLetters() {
        Path file = dir.resolve("empty.txt");
        FileUtils.writeText(file, "");
        assertEquals(0, task.count(file));
    }

    @Test
    void missingFileThrows() {
        assertThrows(UncheckedIOException.class, () -> task.count(dir.resolve("missing.txt")));
    }
}
