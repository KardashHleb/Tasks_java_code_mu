package org.example.level2_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArraySquaresSumTest {

    private final ArraySquaresSum summer = new ArraySquaresSum();

    @Test
    void sumsSquares() {
        assertEquals(14, summer.sumSquares(new int[] {1, -2, 3}));
    }

    @Test
    void emptyArray() {
        assertEquals(0, summer.sumSquares(new int[0]));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> summer.sumSquares(null));
    }
}
