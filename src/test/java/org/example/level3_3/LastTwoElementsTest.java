package org.example.level3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LastTwoElementsTest {

    private final LastTwoElements task = new LastTwoElements();

    @Test
    void takesLastTwo() {
        assertArrayEquals(new int[]{4, 5}, task.takeLastTwo(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void exactlyTwo() {
        assertArrayEquals(new int[]{8, 9}, task.takeLastTwo(new int[]{8, 9}));
    }

    @Test
    void tooShortArrayIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.takeLastTwo(new int[]{1}));
    }
}
