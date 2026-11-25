package org.example.level10_8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ColumnSumsTest {

    private final ColumnSums task = new ColumnSums();

    @Test
    void sumsColumns() {
        assertArrayEquals(new long[]{5, 7, 9}, task.sum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    @Test
    void handlesJaggedRows() {
        assertArrayEquals(new long[]{11, 7, 3}, task.sum(new int[][]{{1, 2, 3}, {4, 5}, {6}}));
    }

    @Test
    void handlesEmptyMatrixAndLargeValues() {
        assertArrayEquals(new long[0], task.sum(new int[0][]));
        assertArrayEquals(new long[]{4294967294L}, task.sum(new int[][]{{Integer.MAX_VALUE}, {Integer.MAX_VALUE}}));
    }
}
