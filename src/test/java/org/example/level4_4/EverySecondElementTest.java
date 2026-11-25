package org.example.level4_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EverySecondElementTest {

    private final EverySecondElement task = new EverySecondElement();

    @Test
    void oddLength() {
        assertArrayEquals(new int[]{1, 3, 5}, task.take(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void evenLength() {
        assertArrayEquals(new int[]{1, 3}, task.take(new int[]{1, 2, 3, 4}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[0], task.take(new int[0]));
    }
}
