package org.example.level10_9;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ColumnSwapperTest {

    private final ColumnSwapper task = new ColumnSwapper();

    @Test
    void swapsColumnsInCopy() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        assertArrayEquals(new int[][]{{3, 2, 1}, {6, 5, 4}}, task.swap(matrix, 0, 2));
        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5, 6}}, matrix);
    }

    @Test
    void handlesOneByOneMatrix() {
        assertArrayEquals(new int[][]{{1}}, task.swap(new int[][]{{1}}, 0, 0));
    }

    @Test
    void rejectsColumnOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> task.swap(new int[][]{{1, 2}}, 0, 2));
    }
}
