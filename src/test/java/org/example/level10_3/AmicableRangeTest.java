package org.example.level10_3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AmicableRangeTest {

    private final AmicableRange task = new AmicableRange();

    @Test
    void findsPairsInRange() {
        assertArrayEquals(new int[][]{{220, 284}, {1184, 1210}}, task.pairs(1, 1300).toArray(int[][]::new));
    }

    @Test
    void pairMustLieEntirelyInRange() {
        assertArrayEquals(new int[0][], task.pairs(221, 300).toArray(int[][]::new));
        assertArrayEquals(new int[0][], task.pairs(1, 283).toArray(int[][]::new));
    }

    @Test
    void rejectsInvalidRange() {
        assertThrows(IllegalArgumentException.class, () -> task.pairs(0, 10));
        assertThrows(IllegalArgumentException.class, () -> task.pairs(10, 1));
    }
}
