package org.example.level10_5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ZeroMainDiagonalTest {

    private final ZeroMainDiagonal task = new ZeroMainDiagonal();

    @Test
    void zeroesMainDiagonalInCopy() {
        int[][] matrix = {{1, 2}, {3, 4}};
        assertArrayEquals(new int[][]{{0, 2}, {3, 0}}, task.zero(matrix));
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, matrix);
    }

    @Test
    void handlesOneByOneMatrix() {
        assertArrayEquals(new int[][]{{0}}, task.zero(new int[][]{{8}}));
    }

    @Test
    void rejectsNonSquareMatrix() {
        assertThrows(IllegalArgumentException.class, () -> task.zero(new int[][]{{1, 2, 3}}));
    }
}
