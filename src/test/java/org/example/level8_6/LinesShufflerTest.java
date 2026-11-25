package org.example.level8_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class LinesShufflerTest {

    private final LinesShuffler task = new LinesShuffler();

    @TempDir
    Path dir;

    @Test
    void keepsSameLinesAndWritesNewOrder() {
        Path file = dir.resolve("lines.txt");
        FileUtils.writeText(file, "one\ntwo\nthree\nfour\nfive\n");
        List<String> result = task.shuffle(file, new Random(5));
        assertEquals(result, FileUtils.readLines(file));
        List<String> sorted = new ArrayList<>(result);
        sorted.sort(null);
        assertEquals(List.of("five", "four", "one", "three", "two"), sorted);
    }

    @Test
    void sameSeedGivesSameOrder() {
        Path first = dir.resolve("a.txt");
        Path second = dir.resolve("b.txt");
        FileUtils.writeText(first, "1\n2\n3\n4\n5\n6");
        FileUtils.writeText(second, "1\n2\n3\n4\n5\n6");
        assertEquals(task.shuffle(first, new Random(9)), task.shuffle(second, new Random(9)));
    }

    @Test
    void emptyFileStaysEmpty() {
        Path file = dir.resolve("empty.txt");
        FileUtils.writeText(file, "");
        assertEquals(List.of(), task.shuffle(file));
        assertEquals("", FileUtils.readText(file));
    }
}
