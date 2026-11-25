package org.example.level4_5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitSumThirteenTest {

    private final int[] numbers = new DigitSumThirteen().find();

    @Test
    void firstNumbers() {
        assertArrayEquals(new int[]{49, 58, 67, 76, 85, 94, 139}, Arrays.copyOf(numbers, 7));
    }

    @Test
    void lastNumberAndCount() {
        assertEquals(940, numbers[numbers.length - 1]);
        assertEquals(75, numbers.length);
    }
}
