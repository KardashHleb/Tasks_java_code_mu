package org.example.level8_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class CharPercentWriterTest {

    private final CharPercentWriter task = new CharPercentWriter();

    @TempDir
    Path dir;

    @Test
    void writesPercentagesInOrderOfFirstAppearance() {
        Path source = dir.resolve("chars.txt");
        Path target = dir.resolve("percents.txt");
        FileUtils.writeText(source, "aab");
        assertEquals("a 66.6%\nb 33.3%", task.write(source, target));
        assertEquals("a 66.6%\nb 33.3%", FileUtils.readText(target));
    }

    @Test
    void namesWhitespaceCharacters() {
        assertEquals("x 25.0%\nspace 25.0%\n\\n 25.0%\n\\t 25.0%", task.percentages("x \n\t"));
    }

    @Test
    void emptyTextGivesEmptyResult() {
        assertEquals("", task.percentages(""));
    }
}
