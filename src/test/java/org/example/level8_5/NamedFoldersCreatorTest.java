package org.example.level8_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class NamedFoldersCreatorTest {

    private final NamedFoldersCreator task = new NamedFoldersCreator();

    @TempDir
    Path dir;

    @Test
    void createsFoldersIncludingNestedOnes() {
        Path root = dir.resolve("root");
        List<Path> created = task.create(root, List.of("one", "two/three"));
        assertEquals(List.of(root.resolve("one"), root.resolve("two/three")), created);
        created.forEach(folder -> assertTrue(Files.isDirectory(folder)));
    }

    @Test
    void existingFolderIsKept() {
        task.create(dir, List.of("same"));
        assertEquals(List.of(dir.resolve("same")), task.create(dir, List.of("same")));
    }

    @Test
    void rejectsBlankName() {
        assertThrows(IllegalArgumentException.class, () -> task.create(dir, List.of("")));
    }
}
