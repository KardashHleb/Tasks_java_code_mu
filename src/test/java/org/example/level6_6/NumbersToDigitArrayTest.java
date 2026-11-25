package org.example.level6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumbersToDigitArrayTest {

    private final NumbersToDigitArray splitter = new NumbersToDigitArray();

    @Test
    void splitsIntoDigits() {
        assertArrayEquals(new byte[]{1, 2, 3, 4, 5, 0, 6}, splitter.split(new int[]{12, 345, 0, 6}));
    }

    @Test
    void negativeNumbersAndEmptyArray() {
        assertArrayEquals(new byte[]{4, 0}, splitter.split(new int[]{-40}));
        assertArrayEquals(new byte[0], splitter.split(new int[0]));
    }
}
