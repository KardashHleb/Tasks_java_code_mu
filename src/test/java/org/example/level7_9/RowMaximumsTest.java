package org.example.level7_9;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class RowMaximumsTest {

    private final RowMaximums task = new RowMaximums();

    @Test
    void findsMaximumOfEachRow() {
        int[][] rows = {{1, 5, 3}, {-4, -2}, {7}};
        assertArrayEquals(new int[] {5, -2, 7}, task.maxima(rows));
    }

    @Test
    void handlesNoRows() {
        assertArrayEquals(new int[0], task.maxima(new int[0][]));
    }

    @Test
    void rejectsEmptyRow() {
        assertThrows(IllegalArgumentException.class, () -> task.maxima(new int[][] {{1}, {}}));
    }
}
