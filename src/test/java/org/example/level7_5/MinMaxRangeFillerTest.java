package org.example.level7_5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MinMaxRangeFillerTest {

    private final MinMaxRangeFiller task = new MinMaxRangeFiller();

    @Test
    void fillsAscendingRange() {
        assertArrayEquals(new int[] {3, 4, 5, 6}, task.fill(3, 6));
    }

    @Test
    void acceptsBoundsInReverseOrder() {
        assertArrayEquals(new int[] {-1, 0, 1, 2}, task.fill(2, -1));
    }

    @Test
    void equalBoundsGiveSingleElement() {
        assertArrayEquals(new int[] {7}, task.fill(7, 7));
    }
}
