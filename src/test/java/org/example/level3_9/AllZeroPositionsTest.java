package org.example.level3_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AllZeroPositionsTest {

    private final AllZeroPositions task = new AllZeroPositions();

    @Test
    void findsAllZeros() {
        assertArrayEquals(new int[]{1, 3, 4}, task.findZeroPositions("10200"));
    }

    @Test
    void noZeros() {
        assertArrayEquals(new int[0], task.findZeroPositions("123"));
    }

    @Test
    void emptyString() {
        assertArrayEquals(new int[0], task.findZeroPositions(""));
    }
}
