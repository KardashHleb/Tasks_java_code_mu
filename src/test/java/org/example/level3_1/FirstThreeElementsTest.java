package org.example.level3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstThreeElementsTest {

    private final FirstThreeElements task = new FirstThreeElements();

    @Test
    void takesFirstThree() {
        assertArrayEquals(new int[]{1, 2, 3}, task.takeFirstThree(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void exactlyThreeElements() {
        assertArrayEquals(new int[]{7, 8, 9}, task.takeFirstThree(new int[]{7, 8, 9}));
    }

    @Test
    void tooShortArrayIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.takeFirstThree(new int[]{1, 2}));
    }
}
