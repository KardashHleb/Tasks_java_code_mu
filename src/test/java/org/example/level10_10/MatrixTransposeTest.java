package org.example.level10_10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MatrixTransposeTest {

    private final MatrixTranspose task = new MatrixTranspose();

    @Test
    void transposesRectangularMatrix() {
        assertArrayEquals(new int[][]{{1, 4}, {2, 5}, {3, 6}}, task.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    @Test
    void handlesOneByOneAndEmptyMatrix() {
        assertArrayEquals(new int[][]{{5}}, task.transpose(new int[][]{{5}}));
        assertEquals(0, task.transpose(new int[0][]).length);
    }

    @Test
    void rejectsJaggedMatrix() {
        assertThrows(IllegalArgumentException.class, () -> task.transpose(new int[][]{{1, 2}, {3}}));
    }
}
