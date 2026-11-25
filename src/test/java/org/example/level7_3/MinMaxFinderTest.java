package org.example.level7_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

    private final MinMaxFinder task = new MinMaxFinder();

    @Test
    void findsMinAndMax() {
        assertEquals(new MinMaxFinder.MinMax(-4, 9), task.find(new int[] {3, 9, -4, 0}));
    }

    @Test
    void handlesSingleElement() {
        assertEquals(new MinMaxFinder.MinMax(5, 5), task.find(new int[] {5}));
    }

    @Test
    void rejectsEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> task.find(new int[0]));
    }
}
