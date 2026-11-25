package org.example.level3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MiddleThreeElementsTest {

    private final MiddleThreeElements task = new MiddleThreeElements();

    @Test
    void oddLength() {
        assertArrayEquals(new int[]{3, 4, 5}, task.takeMiddleThree(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    @Test
    void evenLength() {
        assertArrayEquals(new int[]{3, 4, 5}, task.takeMiddleThree(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    void exactlyThree() {
        assertArrayEquals(new int[]{1, 2, 3}, task.takeMiddleThree(new int[]{1, 2, 3}));
    }

    @Test
    void tooShortArrayIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.takeMiddleThree(new int[]{1, 2}));
    }
}
