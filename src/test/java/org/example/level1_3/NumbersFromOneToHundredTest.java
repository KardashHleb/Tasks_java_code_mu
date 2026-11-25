package org.example.level1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersFromOneToHundredTest {

    @Test
    void containsOneToHundredInOrder() {
        int[] numbers = new NumbersFromOneToHundred().numbers();
        assertEquals(100, numbers.length);
        assertEquals(1, numbers[0]);
        assertEquals(100, numbers[99]);
        for (int i = 1; i < numbers.length; i++) {
            assertEquals(numbers[i - 1] + 1, numbers[i]);
        }
    }
}
