package org.example.level8_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class TimePrependerTest {

    private final TimePrepender task = new TimePrepender();
    private final LocalDateTime moment = LocalDateTime.of(2026, 11, 25, 18, 30, 0);

    @TempDir
    Path dir;

    @Test
    void insertsTimeAsFirstLine() {
        Path file = dir.resolve("log.txt");
        FileUtils.writeText(file, "first\nsecond");
        assertEquals("2026-11-25 18:30:00\nfirst\nsecond", task.prepend(file, moment));
        assertEquals("2026-11-25 18:30:00\nfirst\nsecond", FileUtils.readText(file));
    }

    @Test
    void handlesEmptyFile() {
        Path file = dir.resolve("empty.txt");
        FileUtils.writeText(file, "");
        assertEquals("2026-11-25 18:30:00\n", task.prepend(file, moment));
    }

    @Test
    void missingFileThrows() {
        assertThrows(UncheckedIOException.class, () -> task.prepend(dir.resolve("missing.txt"), moment));
    }
}
