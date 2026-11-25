package org.example.level8_10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FolderSizeReaderTest {

    private final FolderSizeReader task = new FolderSizeReader();

    @TempDir
    Path dir;

    @Test
    void sumsSizesOfNestedFiles() {
        FileUtils.writeText(dir.resolve("a.txt"), "12345");
        FileUtils.writeText(dir.resolve("sub/b.txt"), "123");
        FileUtils.writeText(dir.resolve("sub/inner/c.txt"), "");
        assertEquals(8, task.size(dir));
    }

    @Test
    void emptyFolderHasZeroSize() {
        assertEquals(0, task.size(dir));
    }

    @Test
    void missingFolderThrows() {
        assertThrows(IllegalArgumentException.class, () -> task.size(dir.resolve("missing")));
    }
}
