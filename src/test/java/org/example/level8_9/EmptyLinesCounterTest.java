package org.example.level8_9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class EmptyLinesCounterTest {

    private final EmptyLinesCounter task = new EmptyLinesCounter();

    @TempDir
    Path dir;

    @Test
    void countsEmptyLines() {
        Path file = dir.resolve("lines.txt");
        FileUtils.writeText(file, "\none\n\n\ntwo\n \n");
        assertEquals(3, task.count(file));
    }

    @Test
    void trailingNewlineIsNotAnEmptyLine() {
        Path file = dir.resolve("lines.txt");
        FileUtils.writeText(file, "one\r\ntwo\r\n");
        assertEquals(0, task.count(file));
    }

    @Test
    void emptyFileHasNoLines() {
        Path file = dir.resolve("empty.txt");
        FileUtils.writeText(file, "");
        assertEquals(0, task.count(file));
    }
}
