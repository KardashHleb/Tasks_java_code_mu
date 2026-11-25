package org.example.level8_9;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DoubledDigitsArrayTest {

    @Test
    void buildsDigitPairs() {
        assertArrayEquals(new int[] {12, 34, 56, 78, 90}, new DoubledDigitsArray().make());
    }
}
