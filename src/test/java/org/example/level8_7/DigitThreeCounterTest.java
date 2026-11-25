package org.example.level8_7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DigitThreeCounterTest {

    private final DigitThreeCounter task = new DigitThreeCounter();

    @Test
    void countsDigitThree() {
        assertEquals(5, task.count(new int[] {3, 33, 130, -23, 45}));
    }

    @Test
    void handlesZeroAndEmptyArray() {
        assertEquals(0, task.count(new int[] {0, 12}));
        assertEquals(0, task.count(new int[0]));
    }

    @Test
    void handlesMinimumInteger() {
        assertEquals(1, task.count(new int[] {Integer.MIN_VALUE}));
    }
}
