package org.example.level10_10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinMaxSwapTest {

    private final MinMaxSwap task = new MinMaxSwap();

    @Test
    void swapsMinimumAndMaximum() {
        int[][] matrix = {{1, 5}, {9, 3}};
        assertArrayEquals(new int[][]{{9, 5}, {1, 3}}, task.swap(matrix));
        assertArrayEquals(new int[][]{{1, 5}, {9, 3}}, matrix);
    }

    @Test
    void handlesSingleElementAndEmptyMatrix() {
        assertArrayEquals(new int[][]{{4}}, task.swap(new int[][]{{4}}));
        assertEquals(0, task.swap(new int[0][]).length);
    }
}
