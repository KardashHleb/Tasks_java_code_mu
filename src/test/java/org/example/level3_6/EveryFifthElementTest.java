package org.example.level3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EveryFifthElementTest {

    private final EveryFifthElement task = new EveryFifthElement();

    @Test
    void takesEveryFifth() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        assertArrayEquals(new int[]{5, 10}, task.take(arr));
    }

    @Test
    void shorterThanFiveGivesNothing() {
        assertArrayEquals(new int[0], task.take(new int[]{1, 2, 3, 4}));
    }
}
