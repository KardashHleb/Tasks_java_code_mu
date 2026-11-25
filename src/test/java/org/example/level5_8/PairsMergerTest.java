package org.example.level5_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PairsMergerTest {

    private final PairsMerger merger = new PairsMerger();

    @Test
    void gluesPairs() {
        assertArrayEquals(new long[]{12, 345, 100, 50}, merger.merge(new int[]{1, 2, 3, 45, 10, 0, 0, 50}));
    }

    @Test
    void handlesLargeNumbers() {
        assertArrayEquals(new long[]{123456789987654321L}, merger.merge(new int[]{123456789, 987654321}));
        assertThrows(ArithmeticException.class, () -> merger.merge(new int[]{2147483647, 2147483647}));
    }

    @Test
    void rejectsOddLengthAndNegatives() {
        assertThrows(IllegalArgumentException.class, () -> merger.merge(new int[]{1, 2, 3}));
        assertThrows(IllegalArgumentException.class, () -> merger.merge(new int[]{1, -2}));
    }
}
