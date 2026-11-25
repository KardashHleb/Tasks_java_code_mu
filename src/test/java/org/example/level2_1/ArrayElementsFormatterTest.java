package org.example.level2_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayElementsFormatterTest {

    private final ArrayElementsFormatter formatter = new ArrayElementsFormatter();

    @Test
    void formatsElements() {
        assertEquals("1, -2, 3", formatter.format(new int[] {1, -2, 3}));
    }

    @Test
    void singleElement() {
        assertEquals("42", formatter.format(new int[] {42}));
    }

    @Test
    void emptyArray() {
        assertEquals("", formatter.format(new int[0]));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> formatter.format(null));
    }
}
