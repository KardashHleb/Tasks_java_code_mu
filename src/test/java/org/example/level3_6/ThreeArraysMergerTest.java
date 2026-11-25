package org.example.level3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ThreeArraysMergerTest {

    private final ThreeArraysMerger task = new ThreeArraysMerger();

    @Test
    void concatenatesThree() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6},
                task.merge(new int[]{1, 2}, new int[]{3}, new int[]{4, 5, 6}));
    }

    @Test
    void emptyMiddleArray() {
        assertArrayEquals(new int[]{1, 2}, task.merge(new int[]{1}, new int[0], new int[]{2}));
    }
}
