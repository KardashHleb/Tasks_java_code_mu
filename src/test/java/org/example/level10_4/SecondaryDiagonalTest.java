package org.example.level10_4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SecondaryDiagonalTest {

    private final SecondaryDiagonal task = new SecondaryDiagonal();

    @Test
    void takesSecondaryDiagonal() {
        assertArrayEquals(new int[]{3, 5, 7}, task.take(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    void handlesOneByOneMatrix() {
        assertArrayEquals(new int[]{7}, task.take(new int[][]{{7}}));
    }

    @Test
    void rejectsNonSquareMatrix() {
        assertThrows(IllegalArgumentException.class, () -> task.take(new int[][]{{1, 2}, {3, 4}, {5, 6}}));
    }
}
