package org.example.level8_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FileNumbersSquarerTest {

    private final FileNumbersSquarer task = new FileNumbersSquarer();

    @TempDir
    Path dir;

    @Test
    void squaresNumbersInPlace() {
        Path file = dir.resolve("numbers.txt");
        FileUtils.writeText(file, "1 2 3\n12, 0\n");
        assertEquals("1 4 9\n144, 0\n", task.square(file));
        assertEquals("1 4 9\n144, 0\n", FileUtils.readText(file));
    }

    @Test
    void keepsTextWithoutNumbers() {
        assertEquals("no numbers here", task.square("no numbers here"));
        assertEquals("", task.square(""));
    }

    @Test
    void handlesLargeNumbers() {
        assertEquals("10000000000", task.square("100000"));
    }
}
