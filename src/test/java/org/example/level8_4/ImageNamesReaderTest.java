package org.example.level8_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class ImageNamesReaderTest {

    private final ImageNamesReader task = new ImageNamesReader();

    @TempDir
    Path dir;

    @Test
    void listsImagesOnlyInFolderItself() {
        FileUtils.writeText(dir.resolve("photo.JPG"), "");
        FileUtils.writeText(dir.resolve("icon.gif"), "");
        FileUtils.writeText(dir.resolve("note.txt"), "");
        FileUtils.writeText(dir.resolve("nested/pic.png"), "");
        assertEquals(List.of("icon.gif", "photo.JPG"), task.names(dir));
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
