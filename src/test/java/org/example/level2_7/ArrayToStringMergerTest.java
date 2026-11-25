package org.example.level2_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayToStringMergerTest {

    private final ArrayToStringMerger merger = new ArrayToStringMerger();

    @Test
    void mergesElements() {
        assertEquals("12-34", merger.merge(new int[] {1, 2, -3, 4}));
    }

    @Test
    void emptyArray() {
        assertEquals("", merger.merge(new int[0]));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> merger.merge(null));
    }
}
