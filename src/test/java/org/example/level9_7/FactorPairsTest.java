package org.example.level9_7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FactorPairsTest {

    private final FactorPairs task = new FactorPairs();

    @Test
    void findsAllPairs() {
        assertArrayEquals(new int[][]{{1, 12}, {2, 6}, {3, 4}}, task.pairs(12).toArray(int[][]::new));
    }

    @Test
    void squaresAndPrimes() {
        assertArrayEquals(new int[][]{{1, 16}, {2, 8}, {4, 4}}, task.pairs(16).toArray(int[][]::new));
        assertArrayEquals(new int[][]{{1, 13}}, task.pairs(13).toArray(int[][]::new));
        assertArrayEquals(new int[][]{{1, 1}}, task.pairs(1).toArray(int[][]::new));
    }

    @Test
    void rejectsNonPositiveNumbers() {
        assertThrows(IllegalArgumentException.class, () -> task.pairs(0));
        assertThrows(IllegalArgumentException.class, () -> task.pairs(-6));
    }
}
