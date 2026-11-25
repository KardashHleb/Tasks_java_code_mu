package org.example.level6_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RangeArrayFillerTest {

    private final RangeArrayFiller filler = new RangeArrayFiller();

    @Test
    void fillsAscendingRange() {
        assertArrayEquals(new int[]{3, 4, 5, 6}, filler.fill(3, 6));
    }

    @Test
    void acceptsReversedBoundsAndSingleValue() {
        assertArrayEquals(new int[]{-2, -1, 0, 1}, filler.fill(1, -2));
        assertArrayEquals(new int[]{7}, filler.fill(7, 7));
    }

    @Test
    void rejectsHugeRange() {
        assertThrows(IllegalArgumentException.class, () -> filler.fill(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
