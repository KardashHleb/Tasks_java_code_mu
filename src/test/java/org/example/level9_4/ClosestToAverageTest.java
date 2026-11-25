package org.example.level9_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ClosestToAverageTest {

    private final ClosestToAverage task = new ClosestToAverage();

    @Test
    void findsElementClosestToMean() {
        assertEquals(4, task.find(new int[]{1, 4, 9, 2}));
    }

    @Test
    void firstElementWinsOnTie() {
        assertEquals(1, task.find(new int[]{1, 3}));
    }

    @Test
    void singleElement() {
        assertEquals(-7, task.find(new int[]{-7}));
    }

    @Test
    void rejectsEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> task.find(new int[0]));
    }
}
