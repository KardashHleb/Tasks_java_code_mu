package org.example.level1_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenNumbersFromOneToHundredTest {

    @Test
    void containsAllEvenNumbers() {
        int[] numbers = new EvenNumbersFromOneToHundred().evenNumbers();
        assertEquals(50, numbers.length);
        assertEquals(2, numbers[0]);
        assertEquals(100, numbers[49]);
        for (int number : numbers) {
            assertEquals(0, number % 2);
        }
    }
}
