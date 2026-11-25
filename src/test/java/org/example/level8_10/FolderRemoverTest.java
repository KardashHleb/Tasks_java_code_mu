package org.example.level8_10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FolderRemoverTest {

    private final FolderRemover task = new FolderRemover();

    @TempDir
    Path dir;

    @Test
    void removesFolderWithNestedContent() throws Exception {
        Path folder = dir.resolve("trash");
        FileUtils.writeText(folder.resolve("a.txt"), "a");
        FileUtils.writeText(folder.resolve("sub/inner/b.txt"), "b");
        Files.createDirectories(folder.resolve("emptyFolder"));
        FileUtils.writeText(dir.resolve("keep.txt"), "keep");
        task.remove(folder);
        assertFalse(Files.exists(folder));
        assertTrue(Files.exists(dir.resolve("keep.txt")));
    }

    @Test
    void rejectsMissingFolderAndFile() {
        FileUtils.writeText(dir.resolve("file.txt"), "");
        assertThrows(IllegalArgumentException.class, () -> task.remove(dir.resolve("missing")));
        assertThrows(IllegalArgumentException.class, () -> task.remove(dir.resolve("file.txt")));
    }
}
