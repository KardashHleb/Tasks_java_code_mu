package org.example.level5_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LinesToArrayTest {

    private final LinesToArray splitter = new LinesToArray();

    @Test
    void splitsAndSkipsEmptyLines() {
        assertArrayEquals(new String[]{"one", "two", "three"}, splitter.split("one\r\ntwo\n\nthree\n"));
    }

    @Test
    void emptyText() {
        assertArrayEquals(new String[0], splitter.split(""));
    }
}
