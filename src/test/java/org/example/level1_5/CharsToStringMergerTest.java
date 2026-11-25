package org.example.level1_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharsToStringMergerTest {

    private final CharsToStringMerger merger = new CharsToStringMerger();

    @Test
    void mergesLetters() {
        assertEquals("abc", merger.merge('a', 'b', 'c'));
    }

    @Test
    void mergesDigitsAsText() {
        assertEquals("123", merger.merge('1', '2', '3'));
    }
}
