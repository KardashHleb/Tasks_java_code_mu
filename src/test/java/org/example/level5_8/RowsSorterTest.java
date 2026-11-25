package org.example.level5_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RowsSorterTest {

    private final RowsSorter sorter = new RowsSorter();

    @Test
    void sortsEachRow() {
        assertArrayEquals(new int[][]{{1, 2, 3}, {-1, 0, 5}}, sorter.sortRows(new int[][]{{3, 1, 2}, {5, -1, 0}}));
    }

    @Test
    void doesNotModifyInput() {
        int[][] input = {{2, 1}};
        sorter.sortRows(input);
        assertArrayEquals(new int[][]{{2, 1}}, input);
    }
}
