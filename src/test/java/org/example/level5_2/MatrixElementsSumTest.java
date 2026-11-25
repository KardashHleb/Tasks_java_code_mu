package org.example.level5_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixElementsSumTest {

    private final MatrixElementsSum summer = new MatrixElementsSum();

    @Test
    void sumsAllElements() {
        assertEquals(15, summer.sum(new int[][]{{1, 2, 3}, {4, 5}}));
    }

    @Test
    void handlesNegativesAndEmptyRows() {
        assertEquals(-2, summer.sum(new int[][]{{-5, 3}, {}}));
    }
}
