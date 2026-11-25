package org.example.level8_7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class NestedFileNamesReaderTest {

    private final NestedFileNamesReader task = new NestedFileNamesReader();

    @TempDir
    Path dir;

    @Test
    void collectsNamesFromAllLevels() throws Exception {
        FileUtils.writeText(dir.resolve("b.txt"), "");
        FileUtils.writeText(dir.resolve("sub/c.png"), "");
        FileUtils.writeText(dir.resolve("sub/inner/a.txt"), "");
        Files.createDirectories(dir.resolve("emptyFolder"));
        assertEquals(List.of("a.txt", "b.txt", "c.png"), task.names(dir));
    }

    @Test
    void emptyFolderGivesEmptyList() {
        assertEquals(List.of(), task.names(dir));
    }

    @Test
    void missingFolderThrows() {
        assertThrows(IllegalArgumentException.class, () -> task.names(dir.resolve("missing")));
    }
}
