package org.example.level4_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EvenOddPositionsDividerTest {

    private final EvenOddPositionsDivider task = new EvenOddPositionsDivider();

    @Test
    void dividesSums() {
        // odd positions: 1 + 3 + 5 = 9, even positions: 2 + 4 + 6 = 12
        assertEquals(12.0 / 9.0, task.divide(new int[]{1, 2, 3, 4, 5, 6}), 1e-9);
    }

    @Test
    void singleElement() {
        assertEquals(0.0, task.divide(new int[]{7}), 1e-9);
    }

    @Test
    void zeroOddSumIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.divide(new int[0]));
        assertThrows(IllegalArgumentException.class, () -> task.divide(new int[]{0, 5}));
    }
}
