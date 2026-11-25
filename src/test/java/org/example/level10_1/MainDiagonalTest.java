package org.example.level10_1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MainDiagonalTest {

    private final MainDiagonal task = new MainDiagonal();

    @Test
    void takesMainDiagonal() {
        assertArrayEquals(new int[]{1, 5, 9}, task.take(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    void handlesOneByOneAndEmptyMatrix() {
        assertArrayEquals(new int[]{7}, task.take(new int[][]{{7}}));
        assertArrayEquals(new int[0], task.take(new int[0][]));
    }

    @Test
    void rejectsNonSquareMatrix() {
        assertThrows(IllegalArgumentException.class, () -> task.take(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
