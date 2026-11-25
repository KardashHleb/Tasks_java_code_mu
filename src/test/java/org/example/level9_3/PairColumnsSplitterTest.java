package org.example.level9_3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PairColumnsSplitterTest {

    private final PairColumnsSplitter task = new PairColumnsSplitter();

    @Test
    void splitsPairsIntoTwoArrays() {
        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5, 6}}, task.split(new int[][]{{1, 4}, {2, 5}, {3, 6}}));
    }

    @Test
    void handlesNoPairs() {
        assertArrayEquals(new int[][]{{}, {}}, task.split(new int[0][]));
    }

    @Test
    void rejectsRowsThatAreNotPairs() {
        assertThrows(IllegalArgumentException.class, () -> task.split(new int[][]{{1, 2}, {3}}));
    }
}
