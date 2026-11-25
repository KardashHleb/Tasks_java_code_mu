package org.example.level8_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FileLinesReaderTest {

    private final FileLinesReader task = new FileLinesReader();

    @TempDir
    Path dir;

    @Test
    void readsLinesWithAndWithoutTrailingNewline() {
        Path withNewline = dir.resolve("a.txt");
        Path withoutNewline = dir.resolve("b.txt");
        FileUtils.writeText(withNewline, "one\r\ntwo\n\nfour\n");
        FileUtils.writeText(withoutNewline, "one\ntwo");
        assertEquals(List.of("one", "two", "", "four"), task.read(withNewline));
        assertEquals(List.of("one", "two"), task.read(withoutNewline));
    }

    @Test
    void emptyFileHasNoLines() {
        Path file = dir.resolve("empty.txt");
        FileUtils.writeText(file, "");
        assertEquals(List.of(), task.read(file));
    }
}
