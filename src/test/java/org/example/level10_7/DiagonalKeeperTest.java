package org.example.level10_7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DiagonalKeeperTest {

    private final DiagonalKeeper task = new DiagonalKeeper();

    @Test
    void keepsBothDiagonals() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertArrayEquals(new int[][]{{1, 0, 3}, {0, 5, 0}, {7, 0, 9}}, task.keep(matrix));
        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, matrix);
    }

    @Test
    void evenSizeAndOneByOne() {
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, task.keep(new int[][]{{1, 2}, {3, 4}}));
        assertArrayEquals(new int[][]{{6}}, task.keep(new int[][]{{6}}));
    }

    @Test
    void rejectsNonSquareMatrix() {
        assertThrows(IllegalArgumentException.class, () -> task.keep(new int[][]{{1, 2}}));
    }
}
