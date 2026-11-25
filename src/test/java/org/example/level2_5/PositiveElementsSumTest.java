package org.example.level2_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PositiveElementsSumTest {

    private final PositiveElementsSum summer = new PositiveElementsSum();

    @Test
    void sumsOnlyPositive() {
        assertEquals(9, summer.sumPositive(new int[] {1, -5, 0, 8, -3}));
    }

    @Test
    void noPositiveElements() {
        assertEquals(0, summer.sumPositive(new int[] {-1, -2, 0}));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> summer.sumPositive(null));
    }
}
