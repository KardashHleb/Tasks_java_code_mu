package org.example.level8_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.UncheckedIOException;
import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FileCharsCounterTest {

    private final FileCharsCounter task = new FileCharsCounter();

    @TempDir
    Path dir;

    @Test
    void countsCharactersIncludingNewlines() {
        Path file = dir.resolve("text.txt");
        FileUtils.writeText(file, "abc\r\nde f");
        assertEquals(8, task.count(file));
    }

    @Test
    void emptyFileHasNoCharacters() {
        Path file = dir.resolve("empty.txt");
        FileUtils.writeText(file, "");
        assertEquals(0, task.count(file));
    }

    @Test
    void missingFileThrows() {
        assertThrows(UncheckedIOException.class, () -> task.count(dir.resolve("missing.txt")));
    }
}
