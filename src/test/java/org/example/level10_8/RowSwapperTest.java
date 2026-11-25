package org.example.level10_8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class RowSwapperTest {

    private final RowSwapper task = new RowSwapper();

    @Test
    void swapsRowsInCopy() {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        assertArrayEquals(new int[][]{{5, 6}, {3, 4}, {1, 2}}, task.swap(matrix, 0, 2));
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}, {5, 6}}, matrix);
    }

    @Test
    void swappingRowWithItselfKeepsMatrix() {
        assertArrayEquals(new int[][]{{1}}, task.swap(new int[][]{{1}}, 0, 0));
    }

    @Test
    void rejectsRowOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> task.swap(new int[][]{{1}, {2}}, 0, 2));
        assertThrows(IllegalArgumentException.class, () -> task.swap(new int[][]{{1}, {2}}, -1, 1));
    }
}
