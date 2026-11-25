package org.example.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FileUtilsTest {

    @TempDir
    Path dir;

    @Test
    void writesAndReadsTextNormalizingLineEndings() {
        Path file = dir.resolve("nested/a.txt");
        FileUtils.writeText(file, "one\r\ntwo\n");
        assertEquals("one\ntwo\n", FileUtils.readText(file));
        assertEquals(List.of("one", "two"), FileUtils.readLines(file));
    }

    @Test
    void emptyFileHasNoLines() {
        Path file = dir.resolve("empty.txt");
        FileUtils.writeText(file, "");
        assertEquals(List.of(), FileUtils.readLines(file));
    }

    @Test
    void listsFilesSortedAndChecksExtension() {
        FileUtils.writeText(dir.resolve("b.TXT"), "");
        FileUtils.writeText(dir.resolve("a.png"), "");
        List<Path> files = FileUtils.listFiles(dir);
        assertEquals("a.png", files.get(0).getFileName().toString());
        assertTrue(FileUtils.hasExtension(files.get(1), "txt"));
        assertFalse(FileUtils.hasExtension(files.get(0), "txt", "jpg"));
    }
}
