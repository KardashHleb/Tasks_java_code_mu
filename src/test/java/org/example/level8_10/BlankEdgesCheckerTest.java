package org.example.level8_10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BlankEdgesCheckerTest {

    private final BlankEdgesChecker task = new BlankEdgesChecker();

    @TempDir
    Path dir;

    @Test
    void acceptsOneLeadingAndTwoTrailingEmptyLines() {
        Path file = dir.resolve("edges.txt");
        FileUtils.writeText(file, "\nfirst\nsecond\n\n\n");
        assertTrue(task.check(file));
    }

    @Test
    void handlesWindowsLineEndings() {
        Path file = dir.resolve("edges.txt");
        FileUtils.writeText(file, "\r\ntext\r\n\r\n\r\n");
        assertTrue(task.check(file));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "text\n\n\n", "\ntext\n\n", "\n\ntext\n\n\n", "\ntext\n\n\n\n"})
    void rejectsWrongEdges(String content) {
        Path file = dir.resolve("bad.txt");
        FileUtils.writeText(file, content);
        assertFalse(task.check(file));
    }
}
