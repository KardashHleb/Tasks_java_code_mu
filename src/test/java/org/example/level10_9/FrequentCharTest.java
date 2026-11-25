package org.example.level10_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FrequentCharTest {

    private final FrequentChar task = new FrequentChar();

    @TempDir
    Path dir;

    @Test
    void findsMostFrequentCharInFile() {
        Path file = dir.resolve("text.txt");
        FileUtils.writeText(file, "aabbccc\n");
        assertEquals('c', task.find(file));
    }

    @Test
    void ignoresWhitespace() {
        assertEquals('a', task.mostFrequent("a b  a \n\n\n"));
    }

    @Test
    void rejectsBlankText() {
        assertThrows(IllegalArgumentException.class, () -> task.mostFrequent(" \n\t"));
    }
}
