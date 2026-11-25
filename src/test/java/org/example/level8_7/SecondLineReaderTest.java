package org.example.level8_7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class SecondLineReaderTest {

    private final SecondLineReader task = new SecondLineReader();

    @TempDir
    Path dir;

    @Test
    void readsSecondLine() {
        Path file = dir.resolve("lines.txt");
        FileUtils.writeText(file, "one\r\ntwo\r\nthree");
        assertEquals("two", task.read(file));
    }

    @Test
    void secondLineMayBeEmptyOrLast() {
        Path empty = dir.resolve("a.txt");
        Path last = dir.resolve("b.txt");
        FileUtils.writeText(empty, "one\n\nthree");
        FileUtils.writeText(last, "one\ntwo");
        assertEquals("", task.read(empty));
        assertEquals("two", task.read(last));
    }

    @Test
    void rejectsFileWithOneLine() {
        Path file = dir.resolve("single.txt");
        FileUtils.writeText(file, "only\n");
        assertThrows(IllegalArgumentException.class, () -> task.read(file));
    }
}
