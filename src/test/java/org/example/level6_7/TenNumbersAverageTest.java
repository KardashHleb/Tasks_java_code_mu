package org.example.level6_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TenNumbersAverageTest {

    private final TenNumbersAverage calculator = new TenNumbersAverage();

    @Test
    void computesAverage() {
        assertEquals(5.5, calculator.average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 1e-9);
    }

    @Test
    void doesNotOverflow() {
        int max = Integer.MAX_VALUE;
        assertEquals(max, calculator.average(max, max, max, max, max, max, max, max, max, max), 1e-9);
    }

    @Test
    void rejectsWrongCount() {
        assertThrows(IllegalArgumentException.class, () -> calculator.average(1, 2, 3));
    }
}
