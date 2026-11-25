package org.example.level3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoArraysMergerTest {

    private final TwoArraysMerger task = new TwoArraysMerger();

    @Test
    void concatenates() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, task.merge(new int[]{1, 2}, new int[]{3, 4, 5}));
    }

    @Test
    void emptyArrays() {
        assertArrayEquals(new int[]{7}, task.merge(new int[0], new int[]{7}));
        assertArrayEquals(new int[0], task.merge(new int[0], new int[0]));
    }
}
