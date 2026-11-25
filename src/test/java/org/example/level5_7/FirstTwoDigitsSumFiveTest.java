package org.example.level5_7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstTwoDigitsSumFiveTest {

    private final int[] result = new FirstTwoDigitsSumFive().find();

    @Test
    void startsWithTwoDigitNumbers() {
        assertArrayEquals(new int[]{14, 23, 32, 41, 50, 140}, Arrays.copyOf(result, 6));
    }

    @Test
    void countsAllMatches() {
        // 5 two-digit numbers plus 5 prefixes * 10 three-digit numbers each
        assertEquals(55, result.length);
        assertEquals(509, result[result.length - 1]);
    }
}
