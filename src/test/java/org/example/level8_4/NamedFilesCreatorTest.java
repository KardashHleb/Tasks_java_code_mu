package org.example.level8_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class NamedFilesCreatorTest {

    private final NamedFilesCreator task = new NamedFilesCreator();

    @TempDir
    Path dir;

    @Test
    void createsFilesInNewFolder() {
        Path folder = dir.resolve("new");
        List<Path> created = task.create(folder, List.of("a.txt", "sub/b.txt"));
        assertEquals(List.of(folder.resolve("a.txt"), folder.resolve("sub/b.txt")), created);
        created.forEach(file -> assertTrue(Files.isRegularFile(file)));
    }

    @Test
    void keepsExistingFile() {
        FileUtils.writeText(dir.resolve("a.txt"), "content");
        task.create(dir, List.of("a.txt"));
        assertEquals("content", FileUtils.readText(dir.resolve("a.txt")));
    }

    @Test
    void rejectsBlankName() {
        assertThrows(IllegalArgumentException.class, () -> task.create(dir, List.of("ok.txt", " ")));
    }
}
