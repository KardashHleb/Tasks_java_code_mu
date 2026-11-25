package org.example.level8_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class TimeAppenderTest {

    private final TimeAppender task = new TimeAppender();
    private final LocalDateTime moment = LocalDateTime.of(2026, 1, 2, 3, 4, 5);

    @TempDir
    Path dir;

    @Test
    void appendsOnNewLineWhenTrailingNewlineIsMissing() {
        Path file = dir.resolve("log.txt");
        FileUtils.writeText(file, "start");
        assertEquals("start\n2026-01-02 03:04:05", task.append(file, moment));
        assertEquals("start\n2026-01-02 03:04:05", FileUtils.readText(file));
    }

    @Test
    void doesNotAddBlankLine() {
        Path withNewline = dir.resolve("a.txt");
        Path empty = dir.resolve("b.txt");
        FileUtils.writeText(withNewline, "start\n");
        FileUtils.writeText(empty, "");
        assertEquals("start\n2026-01-02 03:04:05", task.append(withNewline, moment));
        assertEquals("2026-01-02 03:04:05", task.append(empty, moment));
    }

    @Test
    void missingFileThrows() {
        assertThrows(UncheckedIOException.class, () -> task.append(dir.resolve("missing.txt"), moment));
    }
}
