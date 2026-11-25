package org.example.level8_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class TextFilesEmptierTest {

    private final TextFilesEmptier task = new TextFilesEmptier();

    @TempDir
    Path dir;

    @Test
    void emptiesOnlyTextFiles() {
        FileUtils.writeText(dir.resolve("one.txt"), "first");
        FileUtils.writeText(dir.resolve("two.TXT"), "second");
        FileUtils.writeText(dir.resolve("data.csv"), "1,2");
        assertEquals(List.of("one.txt", "two.TXT"), task.clear(dir));
        assertEquals("", FileUtils.readText(dir.resolve("one.txt")));
        assertEquals("", FileUtils.readText(dir.resolve("two.TXT")));
        assertEquals("1,2", FileUtils.readText(dir.resolve("data.csv")));
    }

    @Test
    void missingFolderThrows() {
        assertThrows(IllegalArgumentException.class, () -> task.clear(dir.resolve("missing")));
    }
}
