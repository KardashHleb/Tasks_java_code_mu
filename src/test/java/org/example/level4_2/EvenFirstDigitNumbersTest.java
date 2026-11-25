package org.example.level4_2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenFirstDigitNumbersTest {

    private final int[] numbers = new EvenFirstDigitNumbers().find();

    @Test
    void startsAtTwenty() {
        assertArrayEquals(new int[]{20, 21, 22}, Arrays.copyOf(numbers, 3));
    }

    @Test
    void countAndBounds() {
        // 4 tens (20s, 40s, 60s, 80s) * 10 + 4 hundreds * 100 = 440
        assertEquals(440, numbers.length);
        assertEquals(899, numbers[numbers.length - 1]);
    }

    @Test
    void everyFirstDigitIsEven() {
        assertTrue(Arrays.stream(numbers).allMatch(n -> (String.valueOf(n).charAt(0) - '0') % 2 == 0));
    }
}
