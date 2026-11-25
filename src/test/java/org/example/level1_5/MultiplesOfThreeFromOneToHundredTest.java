package org.example.level1_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplesOfThreeFromOneToHundredTest {

    @Test
    void containsAllMultiplesOfThree() {
        int[] numbers = new MultiplesOfThreeFromOneToHundred().multiplesOfThree();
        assertEquals(33, numbers.length);
        assertEquals(3, numbers[0]);
        assertEquals(99, numbers[32]);
        for (int number : numbers) {
            assertEquals(0, number % 3);
        }
    }
}
