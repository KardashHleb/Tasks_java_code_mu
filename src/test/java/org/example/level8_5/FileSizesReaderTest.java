package org.example.level8_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FileSizesReaderTest {

    private final FileSizesReader task = new FileSizesReader();

    @TempDir
    Path dir;

    @Test
    void readsSizesInNameOrderSkippingFolders() {
        FileUtils.writeText(dir.resolve("small.txt"), "ab");
        FileUtils.writeText(dir.resolve("big.txt"), "0123456789");
        FileUtils.writeText(dir.resolve("empty.txt"), "");
        FileUtils.writeText(dir.resolve("sub/inner.txt"), "ignored");
        Map<String, Long> sizes = task.sizes(dir);
        assertEquals(Map.of("big.txt", 10L, "empty.txt", 0L, "small.txt", 2L), sizes);
        assertEquals(List.of("big.txt", "empty.txt", "small.txt"), List.copyOf(sizes.keySet()));
    }

    @Test
    void missingFolderThrows() {
        assertThrows(IllegalArgumentException.class, () -> task.sizes(dir.resolve("missing")));
    }
}
