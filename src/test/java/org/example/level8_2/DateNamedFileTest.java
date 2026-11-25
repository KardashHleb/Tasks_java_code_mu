package org.example.level8_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class DateNamedFileTest {

    private final DateNamedFile task = new DateNamedFile();

    @TempDir
    Path dir;

    @Test
    void createsFileNamedAfterDateInNewFolder() {
        Path folder = dir.resolve("logs");
        Path file = task.create(folder, LocalDate.of(2026, 3, 7));
        assertEquals(folder.resolve("2026-03-07.txt"), file);
        assertTrue(Files.isRegularFile(file));
    }

    @Test
    void keepsExistingFileContent() {
        Path file = dir.resolve("2026-11-25.txt");
        FileUtils.writeText(file, "keep me");
        task.create(dir, LocalDate.of(2026, 11, 25));
        assertEquals("keep me", FileUtils.readText(file));
    }
}
