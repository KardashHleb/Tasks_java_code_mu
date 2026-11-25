package org.example.level3_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FloatPartsSplitterTest {

    private final FloatPartsSplitter task = new FloatPartsSplitter();

    @Test
    void splitsPositiveNumber() {
        assertArrayEquals(new int[]{12, 34}, task.split(12.34f));
    }

    @Test
    void wholeNumberHasZeroFraction() {
        assertArrayEquals(new int[]{5, 0}, task.split(5f));
    }

    @Test
    void negativeNumberKeepsSignInWholePart() {
        assertArrayEquals(new int[]{-3, 25}, task.split(-3.25f));
    }
}
