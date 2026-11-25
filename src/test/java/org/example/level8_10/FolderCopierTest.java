package org.example.level8_10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FolderCopierTest {

    private final FolderCopier task = new FolderCopier();

    @TempDir
    Path dir;

    @Test
    void copiesNestedStructure() throws Exception {
        Path source = dir.resolve("source");
        FileUtils.writeText(source.resolve("a.txt"), "alpha");
        FileUtils.writeText(source.resolve("sub/inner/b.txt"), "beta");
        Files.createDirectories(source.resolve("emptyFolder"));
        Path target = dir.resolve("copy");
        assertEquals(target, task.copy(source, target));
        assertEquals("alpha", FileUtils.readText(target.resolve("a.txt")));
        assertEquals("beta", FileUtils.readText(target.resolve("sub/inner/b.txt")));
        assertTrue(Files.isDirectory(target.resolve("emptyFolder")));
        assertTrue(Files.exists(source.resolve("a.txt")));
    }

    @Test
    void replacesExistingFiles() {
        Path source = dir.resolve("source");
        Path target = dir.resolve("copy");
        FileUtils.writeText(source.resolve("a.txt"), "new");
        FileUtils.writeText(target.resolve("a.txt"), "old");
        task.copy(source, target);
        assertEquals("new", FileUtils.readText(target.resolve("a.txt")));
    }

    @Test
    void rejectsMissingSourceAndCopyIntoItself() {
        assertThrows(IllegalArgumentException.class, () -> task.copy(dir.resolve("missing"), dir.resolve("copy")));
        assertThrows(IllegalArgumentException.class, () -> task.copy(dir, dir.resolve("inside")));
    }
}
