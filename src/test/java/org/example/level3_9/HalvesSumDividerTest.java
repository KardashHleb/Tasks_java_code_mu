package org.example.level3_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HalvesSumDividerTest {

    private final HalvesSumDivider task = new HalvesSumDivider();

    @Test
    void evenLength() {
        assertEquals(6.0 / 15.0, task.divideHalves(new int[]{1, 2, 3, 4, 5, 6}), 1e-9);
    }

    @Test
    void oddLengthMiddleGoesToSecondHalf() {
        assertEquals(3.0 / 12.0, task.divideHalves(new int[]{1, 2, 3, 4, 5}), 1e-9);
    }

    @Test
    void zeroSecondSumIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.divideHalves(new int[]{1, 2, 0, 0}));
    }

    @Test
    void tooShortArrayIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.divideHalves(new int[]{1}));
    }
}
