package org.example.level6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PairSubarraysSplitterTest {

    private final PairSubarraysSplitter splitter = new PairSubarraysSplitter();

    @Test
    void splitsIntoPairs() {
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}, {5, 6}}, splitter.split(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[0][], splitter.split(new int[0]));
    }

    @Test
    void rejectsOddLength() {
        assertThrows(IllegalArgumentException.class, () -> splitter.split(new int[]{1, 2, 3}));
    }
}
