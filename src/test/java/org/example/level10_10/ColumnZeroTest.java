package org.example.level10_10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ColumnZeroTest {

    private final ColumnZero task = new ColumnZero();

    @Test
    void zeroesColumnInCopy() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        assertArrayEquals(new int[][]{{1, 0, 3}, {4, 0, 6}}, task.zero(matrix, 1));
        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5, 6}}, matrix);
    }

    @Test
    void handlesOneByOneMatrix() {
        assertArrayEquals(new int[][]{{0}}, task.zero(new int[][]{{9}}, 0));
    }

    @Test
    void rejectsColumnOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> task.zero(new int[][]{{1, 2}}, 2));
        assertThrows(IllegalArgumentException.class, () -> task.zero(new int[][]{{1, 2}}, -1));
    }
}
