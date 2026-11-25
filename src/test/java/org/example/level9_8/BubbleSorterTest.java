package org.example.level9_8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class BubbleSorterTest {

    private final BubbleSorter task = new BubbleSorter();

    @Test
    void sortsAscending() {
        assertArrayEquals(new int[]{-3, 0, 1, 1, 5, 9}, task.sort(new int[]{5, 1, 9, -3, 1, 0}));
    }

    @Test
    void doesNotChangeInput() {
        int[] values = {3, 2, 1};
        task.sort(values);
        assertArrayEquals(new int[]{3, 2, 1}, values);
    }

    @Test
    void handlesEmptyAndSingleElement() {
        assertArrayEquals(new int[0], task.sort(new int[0]));
        assertArrayEquals(new int[]{4}, task.sort(new int[]{4}));
    }
}
