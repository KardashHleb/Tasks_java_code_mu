package org.example.level3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FloatsToIntsTest {

    private final FloatsToInts task = new FloatsToInts();

    @Test
    void roundsToNearest() {
        assertArrayEquals(new int[]{1, 3, 3, -2}, task.roundToInts(new float[]{1.2f, 2.5f, 3.49f, -1.6f}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[0], task.roundToInts(new float[0]));
    }
}
