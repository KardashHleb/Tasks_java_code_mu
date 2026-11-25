package org.example.level8_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FractionsParenthesesTest {

    private final FractionsParentheses task = new FractionsParentheses();

    @TempDir
    Path dir;

    @Test
    void wrapsFractionsInFile() {
        Path source = dir.resolve("fractions.txt");
        Path target = dir.resolve("out/result.txt");
        FileUtils.writeText(source, "Take 1/2 cup and 3/4 spoon, 5 eggs.");
        String expected = "Take (1/2) cup and (3/4) spoon, 5 eggs.";
        assertEquals(expected, task.wrap(source, target));
        assertEquals(expected, FileUtils.readText(target));
    }

    @Test
    void leavesIncompleteFractionsAlone() {
        assertEquals("10/ and /5 and a/b", task.wrap("10/ and /5 and a/b"));
    }

    @Test
    void handlesFractionAtEndOfText() {
        assertEquals("ratio (12/345)", task.wrap("ratio 12/345"));
        assertEquals("", task.wrap(""));
    }
}
