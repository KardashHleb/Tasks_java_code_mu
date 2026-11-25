package org.example.level1_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersFromMinusHundredToZeroTest {

    @Test
    void ascendingFromMinusHundred() {
        int[] numbers = new NumbersFromMinusHundredToZero().numbers();
        assertEquals(101, numbers.length);
        assertEquals(-100, numbers[0]);
        assertEquals(0, numbers[100]);
        for (int i = 1; i < numbers.length; i++) {
            assertEquals(numbers[i - 1] + 1, numbers[i]);
        }
    }
}
