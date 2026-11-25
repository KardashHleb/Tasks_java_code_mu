package org.example.level1_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersFromHundredToOneTest {

    @Test
    void descendingFromHundred() {
        int[] numbers = new NumbersFromHundredToOne().numbers();
        assertEquals(100, numbers.length);
        assertEquals(100, numbers[0]);
        assertEquals(1, numbers[99]);
        for (int i = 1; i < numbers.length; i++) {
            assertEquals(numbers[i - 1] - 1, numbers[i]);
        }
    }
}
