package org.example.level3_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class UniqueDigitNumbersTest {

    private final UniqueDigitNumbers task = new UniqueDigitNumbers();

    @Test
    void keepsNumbersWithDistinctDigits() {
        assertArrayEquals(new int[]{123, 456, 789}, task.collect(new int[]{123, 334, 456, 556, 789}));
    }

    @Test
    void zeroAndNegativeNumbers() {
        assertArrayEquals(new int[]{0, -12}, task.collect(new int[]{0, -12, -100}));
    }

    @Test
    void emptyInput() {
        assertArrayEquals(new int[0], task.collect(new int[0]));
    }
}
