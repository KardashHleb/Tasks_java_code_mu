package org.example.level2_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstAndLastCharsMergerTest {

    private final FirstAndLastCharsMerger merger = new FirstAndLastCharsMerger();

    @Test
    void mergesEnds() {
        assertEquals("ho", merger.mergeFirstAndLast("hello"));
    }

    @Test
    void singleChar() {
        assertEquals("aa", merger.mergeFirstAndLast("a"));
    }

    @Test
    void rejectsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> merger.mergeFirstAndLast(""));
    }
}
