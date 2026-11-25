package org.example.level9_1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RowsBySumSorterTest {

    private final RowsBySumSorter task = new RowsBySumSorter();

    @Test
    void sortsRowsBySum() {
        int[][] rows = {{5, 5}, {1, 2}, {0, 4, 1}};
        assertArrayEquals(new int[][]{{1, 2}, {0, 4, 1}, {5, 5}}, task.sort(rows));
    }

    @Test
    void doesNotChangeInput() {
        int[][] rows = {{9}, {1}};
        task.sort(rows);
        assertArrayEquals(new int[][]{{9}, {1}}, rows);
    }

    @Test
    void handlesEmptyMatrix() {
        assertEquals(0, task.sort(new int[0][]).length);
    }
}
