package org.example.level5_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SequentialMatrixBuilderTest {

    @Test
    void fillsOneToNine() {
        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new SequentialMatrixBuilder().build());
    }
}
