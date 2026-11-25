package org.example.level8_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class ArrayLineWriterTest {

    private final ArrayLineWriter task = new ArrayLineWriter();

    @TempDir
    Path dir;

    @Test
    void writesOneValuePerLine() {
        Path file = dir.resolve("out/values.txt");
        assertEquals("3\n-1\n20", task.write(new int[] {3, -1, 20}, file));
        assertEquals(List.of("3", "-1", "20"), FileUtils.readLines(file));
    }

    @Test
    void emptyArrayGivesEmptyFile() {
        Path file = dir.resolve("empty.txt");
        task.write(new int[0], file);
        assertEquals("", FileUtils.readText(file));
    }
}
