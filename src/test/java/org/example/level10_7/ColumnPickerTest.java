package org.example.level10_7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ColumnPickerTest {

    private final ColumnPicker task = new ColumnPicker();

    @Test
    void takesColumn() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        assertArrayEquals(new int[]{1, 4}, task.take(matrix, 0));
        assertArrayEquals(new int[]{3, 6}, task.take(matrix, 2));
    }

    @Test
    void handlesOneByOneMatrix() {
        assertArrayEquals(new int[]{5}, task.take(new int[][]{{5}}, 0));
    }

    @Test
    void rejectsColumnOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> task.take(new int[][]{{1, 2}}, 2));
        assertThrows(IllegalArgumentException.class, () -> task.take(new int[][]{{1, 2}}, -1));
    }
}
