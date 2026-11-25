package org.example.level5_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TenNumbersSumTest {

    private final TenNumbersSum summer = new TenNumbersSum();

    @Test
    void sumsTenNumbers() {
        assertEquals(55, summer.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    @Test
    void handlesNegativeNumbers() {
        assertEquals(0, summer.sum(-1, 1, -2, 2, -3, 3, -4, 4, -5, 5));
    }

    @Test
    void rejectsWrongCount() {
        assertThrows(IllegalArgumentException.class, () -> summer.sum(1, 2));
    }
}
