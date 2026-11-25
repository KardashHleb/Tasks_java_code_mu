package org.example.level9_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FrequentWordTest {

    private final FrequentWord task = new FrequentWord();

    @TempDir
    Path dir;

    @Test
    void findsMostFrequentWordInFile() {
        Path file = dir.resolve("text.txt");
        FileUtils.writeText(file, "cat dog cat house cat dog\n");
        assertEquals("cat", task.find(file));
    }

    @Test
    void ignoresCaseAndPunctuation() {
        assertEquals("dog", task.mostFrequent("Dog, cat. DOG! dog?"));
    }

    @Test
    void rejectsTextWithoutWords() {
        assertThrows(IllegalArgumentException.class, () -> task.mostFrequent(" ,.! "));
    }
}
