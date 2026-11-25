package org.example.level8_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class CommaMaxNumberTest {

    private final CommaMaxNumber task = new CommaMaxNumber();

    @TempDir
    Path dir;

    @Test
    void findsMaximumInFile() {
        Path file = dir.resolve("numbers.txt");
        FileUtils.writeText(file, "12,7,-3,45,9\n");
        assertEquals(45, task.max(file));
    }

    @Test
    void handlesNegativeNumbersAndSpaces() {
        assertEquals(-2, task.max("-10, -2 ,-33"));
        assertEquals(0, task.max("-,0,-"));
    }

    @Test
    void rejectsTextWithoutNumbers() {
        Path file = dir.resolve("empty.txt");
        FileUtils.writeText(file, "");
        assertThrows(IllegalArgumentException.class, () -> task.max(file));
        assertThrows(IllegalArgumentException.class, () -> task.max("a, b, -"));
    }
}
