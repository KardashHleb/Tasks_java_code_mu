package org.example.level8_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class TextFileSaverTest {

    private final TextFileSaver task = new TextFileSaver();

    @TempDir
    Path dir;

    @Test
    void savesTextCreatingFolders() {
        Path file = dir.resolve("a/b/note.txt");
        task.save(file, "hello\nworld");
        assertEquals("hello\nworld", FileUtils.readText(file));
    }

    @Test
    void replacesExistingContent() {
        Path file = dir.resolve("note.txt");
        task.save(file, "old text");
        task.save(file, "new");
        assertEquals("new", FileUtils.readText(file));
    }
}
