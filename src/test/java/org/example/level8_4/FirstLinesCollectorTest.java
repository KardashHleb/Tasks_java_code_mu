package org.example.level8_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FirstLinesCollectorTest {

    private final FirstLinesCollector task = new FirstLinesCollector();

    @TempDir
    Path dir;

    @Test
    void collectsFirstLinesOfTextFilesInNameOrder() {
        Path folder = dir.resolve("texts");
        FileUtils.writeText(folder.resolve("b.txt"), "b1\nb2\nb3\n");
        FileUtils.writeText(folder.resolve("a.txt"), "a1");
        FileUtils.writeText(folder.resolve("empty.txt"), "");
        FileUtils.writeText(folder.resolve("skip.md"), "m1\nm2");
        Path target = dir.resolve("first.txt");
        assertEquals("a1\nb1\nb2", task.collect(folder, 2, target));
        assertEquals("a1\nb1\nb2", FileUtils.readText(target));
    }

    @Test
    void zeroCountGivesEmptyResult() {
        FileUtils.writeText(dir.resolve("a.txt"), "line");
        assertEquals("", task.collect(dir, 0, dir.resolve("out.csv")));
    }

    @Test
    void rejectsInvalidArguments() {
        assertThrows(IllegalArgumentException.class, () -> task.collect(dir, -1, dir.resolve("out.csv")));
        assertThrows(IllegalArgumentException.class,
                () -> task.collect(dir.resolve("missing"), 1, dir.resolve("out.csv")));
    }
}
