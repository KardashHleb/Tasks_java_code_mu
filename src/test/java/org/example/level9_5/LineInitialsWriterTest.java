package org.example.level9_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class LineInitialsWriterTest {

    private final LineInitialsWriter task = new LineInitialsWriter();

    @TempDir
    Path dir;

    @Test
    void writesFirstLetterOfEveryLine() {
        Path source = dir.resolve("fruits.txt");
        Path target = dir.resolve("out/initials.txt");
        FileUtils.writeText(source, "apple\nbanana\npear\n");

        assertEquals("abp", task.write(source, target));
        assertEquals("abp", FileUtils.readText(target));
    }

    @Test
    void skipsBlankLinesAndLeadingSpaces() {
        assertEquals("xy", task.initials("  x-ray\n\n\t yellow\n   \n"));
    }

    @Test
    void emptyTextGivesEmptyResult() {
        assertEquals("", task.initials(""));
    }
}
