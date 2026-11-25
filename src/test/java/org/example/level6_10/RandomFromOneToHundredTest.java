package org.example.level6_10;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomFromOneToHundredTest {

    private final RandomFromOneToHundred filler = new RandomFromOneToHundred();

    @Test
    void producesTenNumbersInRange() {
        for (int seed = 0; seed < 100; seed++) {
            int[] numbers = filler.fill(new Random(seed));
            assertEquals(10, numbers.length);
            for (int number : numbers) {
                assertTrue(number >= 1 && number <= 100, "out of range: " + number);
            }
        }
    }

    @Test
    void sameSeedGivesSameNumbers() {
        assertArrayEquals(filler.fill(new Random(42)), filler.fill(new Random(42)));
    }
}
