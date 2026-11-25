package org.example.level8_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class ExtensionFilesDeleterTest {

    private final ExtensionFilesDeleter task = new ExtensionFilesDeleter();

    @TempDir
    Path dir;

    @Test
    void deletesOnlyMatchingFilesInFolder() {
        FileUtils.writeText(dir.resolve("b.log"), "");
        FileUtils.writeText(dir.resolve("A.LOG"), "");
        FileUtils.writeText(dir.resolve("keep.txt"), "");
        FileUtils.writeText(dir.resolve("sub/inner.log"), "");
        assertEquals(List.of("A.LOG", "b.log"), task.delete(dir, ".log"));
        assertTrue(Files.exists(dir.resolve("keep.txt")));
        assertTrue(Files.exists(dir.resolve("sub/inner.log")));
    }

    @Test
    void returnsEmptyListWhenNothingMatches() {
        FileUtils.writeText(dir.resolve("note.txt"), "");
        assertEquals(List.of(), task.delete(dir, "log"));
    }

    @Test
    void rejectsMissingFolderAndEmptyExtension() {
        assertThrows(IllegalArgumentException.class, () -> task.delete(dir.resolve("missing"), "log"));
        assertThrows(IllegalArgumentException.class, () -> task.delete(dir, "."));
    }
}
