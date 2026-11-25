package org.example.level10_6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ZeroBelowDiagonalTest {

    private final ZeroBelowDiagonal task = new ZeroBelowDiagonal();

    @Test
    void zeroesLowerTriangle() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertArrayEquals(new int[][]{{1, 2, 3}, {0, 5, 6}, {0, 0, 9}}, task.zero(matrix));
        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, matrix);
    }

    @Test
    void oneByOneMatrixIsUnchanged() {
        assertArrayEquals(new int[][]{{3}}, task.zero(new int[][]{{3}}));
    }

    @Test
    void rejectsNonSquareMatrix() {
        assertThrows(IllegalArgumentException.class, () -> task.zero(new int[][]{{1, 2}, {3, 4}, {5, 6}}));
    }
}
