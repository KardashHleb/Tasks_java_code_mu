package org.example.level3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DigitsToArrayTest {

    private final DigitsToArray task = new DigitsToArray();

    @Test
    void splitsIntoDigits() {
        assertArrayEquals(new byte[]{1, 2, 0, 4, 5}, task.toDigits(12045));
    }

    @Test
    void zeroIsSingleDigit() {
        assertArrayEquals(new byte[]{0}, task.toDigits(0));
    }

    @Test
    void negativeNumberIgnoresSign() {
        assertArrayEquals(new byte[]{9, 8}, task.toDigits(-98));
    }
}
