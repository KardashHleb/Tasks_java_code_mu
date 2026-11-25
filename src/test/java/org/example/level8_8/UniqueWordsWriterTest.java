package org.example.level8_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.example.common.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class UniqueWordsWriterTest {

    private final UniqueWordsWriter task = new UniqueWordsWriter();

    @TempDir
    Path dir;

    @Test
    void writesDistinctWordsInOrderOfFirstAppearance() {
        Path source = dir.resolve("words.txt");
        Path target = dir.resolve("unique.txt");
        FileUtils.writeText(source, "the cat, the dog\nand THE cat.");
        assertEquals("the cat dog and THE", task.write(source, target));
        assertEquals("the cat dog and THE", FileUtils.readText(target));
    }

    @Test
    void breaksLineAfterTenWords() {
        String text = "w1 w2 w3 w4 w5 w6 w7 w8 w9 w10 w11 w12 w1";
        assertEquals("w1 w2 w3 w4 w5 w6 w7 w8 w9 w10\nw11 w12", task.uniqueWords(text));
    }

    @Test
    void textWithoutWordsGivesEmptyResult() {
        assertEquals("", task.uniqueWords(" ,.! "));
    }
}
