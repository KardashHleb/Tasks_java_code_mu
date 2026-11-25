package org.example.level4_9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomArrayFillerTest {

    private final RandomArrayFiller task = new RandomArrayFiller();

    @Test
    void tenNumbersInRange() {
        int[] arr = task.fill(new Random(42));
        assertEquals(10, arr.length);
        assertTrue(Arrays.stream(arr).allMatch(n -> n >= 1 && n <= 100));
    }

    @Test
    void sameSeedGivesSameArray() {
        assertArrayEquals(task.fill(new Random(7)), task.fill(new Random(7)));
    }
}
