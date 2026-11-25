package org.example.level5_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RepeatedRowsMatrixTest {

    @Test
    void buildsFiveEqualRows() {
        int[] row = {1, 2, 3};
        assertArrayEquals(new int[][]{row, row, row, row, row}, new RepeatedRowsMatrix().build());
    }
}
