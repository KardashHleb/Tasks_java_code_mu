package org.example.level8_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class ImagesMoverTest {

    private final ImagesMover task = new ImagesMover();

    @TempDir
    Path dir;

    @Test
    void movesImagesFromNestedFolders() {
        Path source = dir.resolve("pictures");
        Path target = dir.resolve("images");
        FileUtils.writeText(source.resolve("pic.png"), "png");
        FileUtils.writeText(source.resolve("deep/inner/photo.JPG"), "jpg");
        FileUtils.writeText(source.resolve("note.txt"), "text");
        List<Path> moved = task.move(source, target);
        assertEquals(List.of(target.resolve("photo.JPG"), target.resolve("pic.png")), moved);
        assertEquals("jpg", FileUtils.readText(target.resolve("photo.JPG")));
        assertFalse(Files.exists(source.resolve("pic.png")));
        assertTrue(Files.exists(source.resolve("note.txt")));
    }

    @Test
    void addsSuffixOnNameClash() {
        Path source = dir.resolve("pictures");
        Path target = dir.resolve("images");
        FileUtils.writeText(target.resolve("icon.gif"), "old");
        FileUtils.writeText(source.resolve("a/icon.gif"), "first");
        FileUtils.writeText(source.resolve("b/icon.gif"), "second");
        task.move(source, target);
        assertEquals("old", FileUtils.readText(target.resolve("icon.gif")));
        assertEquals("first", FileUtils.readText(target.resolve("icon_2.gif")));
        assertEquals("second", FileUtils.readText(target.resolve("icon_3.gif")));
    }

    @Test
    void missingSourceFolderThrows() {
        assertThrows(IllegalArgumentException.class, () -> task.move(dir.resolve("missing"), dir.resolve("out")));
    }
}
