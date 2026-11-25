package org.example.level9_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class CharPercentFileTest {

    private final CharPercentFile task = new CharPercentFile();

    @TempDir
    Path dir;

    @Test
    void writesPercentReport() {
        Path source = dir.resolve("text.txt");
        Path target = dir.resolve("report.txt");
        FileUtils.writeText(source, "aab c");

        String expected = "a 40.0%\nb 20.0%\nspace 20.0%\nc 20.0%";
        assertEquals(expected, task.write(source, target));
        assertEquals(expected, FileUtils.readText(target));
    }

    @Test
    void roundsToOneDecimalAndShowsNewLines() {
        assertEquals("x 66.7%\n\\n 33.3%", task.report("x\nx"));
    }

    @Test
    void emptyTextGivesEmptyReport() {
        assertEquals("", task.report(""));
    }
}
