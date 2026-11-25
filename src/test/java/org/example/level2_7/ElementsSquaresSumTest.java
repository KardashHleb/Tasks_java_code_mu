package org.example.level2_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ElementsSquaresSumTest {

    private final ElementsSquaresSum summer = new ElementsSquaresSum();

    @Test
    void sumsSquares() {
        assertEquals(30, summer.sumSquares(new int[] {1, 2, -3, 4}));
    }

    @Test
    void largeValuesDoNotOverflow() {
        assertEquals(10_000_000_000L, summer.sumSquares(new int[] {100_000}));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> summer.sumSquares(null));
    }
}
