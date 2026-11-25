package org.example.level8_6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.UncheckedIOException;
import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FirstLineReaderTest {

    private final FirstLineReader task = new FirstLineReader();

    @TempDir
    Path dir;

    @Test
    void readsFirstLine() {
        Path file = dir.resolve("lines.txt");
        FileUtils.writeText(file, "first line\r\nsecond line\n");
        assertEquals("first line", task.read(file));
    }

    @Test
    void handlesSingleLineAndEmptyFile() {
        Path single = dir.resolve("single.txt");
        Path empty = dir.resolve("empty.txt");
        FileUtils.writeText(single, "only");
        FileUtils.writeText(empty, "");
        assertEquals("only", task.read(single));
        assertEquals("", task.read(empty));
    }

    @Test
    void missingFileThrows() {
        assertThrows(UncheckedIOException.class, () -> task.read(dir.resolve("missing.txt")));
    }
}
