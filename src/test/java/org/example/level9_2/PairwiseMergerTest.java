package org.example.level9_2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PairwiseMergerTest {

    private final PairwiseMerger task = new PairwiseMerger();

    @Test
    void mergesIntoPairs() {
        assertArrayEquals(new int[][]{{1, 4}, {2, 5}, {3, 6}}, task.merge(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    @Test
    void emptyArraysGiveNoPairs() {
        assertEquals(0, task.merge(new int[0], new int[0]).length);
    }

    @Test
    void rejectsDifferentLengths() {
        assertThrows(IllegalArgumentException.class, () -> task.merge(new int[]{1}, new int[]{1, 2}));
    }
}
