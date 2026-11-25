package org.example.level2_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ElementsBeforeZeroCollectorTest {

    private final ElementsBeforeZeroCollector collector = new ElementsBeforeZeroCollector();

    @Test
    void stopsAtFirstZero() {
        assertArrayEquals(new int[] {3, 5}, collector.elementsBeforeZero(new int[] {3, 5, 0, 7, 0}));
    }

    @Test
    void zeroFirst() {
        assertArrayEquals(new int[0], collector.elementsBeforeZero(new int[] {0, 1}));
    }

    @Test
    void noZero() {
        assertArrayEquals(new int[] {1, 2}, collector.elementsBeforeZero(new int[] {1, 2}));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> collector.elementsBeforeZero(null));
    }
}
