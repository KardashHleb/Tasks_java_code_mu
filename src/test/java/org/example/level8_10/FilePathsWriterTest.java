package org.example.level8_10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FilePathsWriterTest {

    private final FilePathsWriter task = new FilePathsWriter();

    @TempDir
    Path dir;

    @Test
    void writesRelativePathsOfNestedFiles() {
        Path folder = dir.resolve("tree");
        FileUtils.writeText(folder.resolve("b.txt"), "");
        FileUtils.writeText(folder.resolve("sub/inner/c.txt"), "");
        FileUtils.writeText(folder.resolve("a.png"), "");
        Path target = dir.resolve("paths.txt");
        List<String> expected = List.of("a.png", "b.txt", "sub/inner/c.txt");
        assertEquals(expected, task.write(folder, target));
        assertEquals(expected, FileUtils.readLines(target));
    }

    @Test
    void emptyFolderGivesEmptyFile() throws Exception {
        Path folder = Files.createDirectories(dir.resolve("empty/nested"));
        assertEquals(List.of(), task.write(folder, dir.resolve("paths.txt")));
        assertEquals("", FileUtils.readText(dir.resolve("paths.txt")));
    }

    @Test
    void missingFolderThrows() {
        assertThrows(IllegalArgumentException.class, () -> task.write(dir.resolve("missing"), dir.resolve("p.txt")));
    }
}
