package org.example.level8_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DigitsInNumbersCounterTest {

    private final DigitsInNumbersCounter task = new DigitsInNumbersCounter();

    @Test
    void countsAllDigits() {
        assertEquals(9, task.count(new int[] {12, 345, -6789}));
    }

    @Test
    void zeroIsOneDigit() {
        assertEquals(2, task.count(new int[] {0, 0}));
        assertEquals(0, task.count(new int[0]));
    }

    @Test
    void handlesMinimumInteger() {
        assertEquals(10, task.count(new int[] {Integer.MIN_VALUE}));
    }
}
