package org.example.level8_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class NestedFilesCounterTest {

    private final NestedFilesCounter task = new NestedFilesCounter();

    @TempDir
    Path dir;

    @Test
    void countsFilesOnAllLevels() throws Exception {
        FileUtils.writeText(dir.resolve("a.txt"), "");
        FileUtils.writeText(dir.resolve("sub/b.txt"), "");
        FileUtils.writeText(dir.resolve("sub/inner/c.txt"), "");
        Files.createDirectories(dir.resolve("emptyFolder"));
        assertEquals(3, task.count(dir));
    }

    @Test
    void emptyFolderHasNoFiles() {
        assertEquals(0, task.count(dir));
    }

    @Test
    void missingFolderThrows() {
        assertThrows(IllegalArgumentException.class, () -> task.count(dir.resolve("missing")));
    }
}
