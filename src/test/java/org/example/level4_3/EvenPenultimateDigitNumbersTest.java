package org.example.level4_3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenPenultimateDigitNumbersTest {

    private final int[] numbers = new EvenPenultimateDigitNumbers().find();

    @Test
    void startsWithTwenties() {
        assertArrayEquals(new int[]{20, 21}, Arrays.copyOf(numbers, 2));
    }

    @Test
    void includesNumbersWithZeroTens() {
        assertTrue(Arrays.stream(numbers).anyMatch(n -> n == 101));
        assertEquals(1000, numbers[numbers.length - 1]);
    }

    @Test
    void excludesOddTens() {
        assertFalse(Arrays.stream(numbers).anyMatch(n -> n == 15 || n == 139));
    }
}
