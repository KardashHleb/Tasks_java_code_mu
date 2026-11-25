package org.example.level4_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumbersWithZeroFilterTest {

    private final NumbersWithZeroFilter filter = new NumbersWithZeroFilter();

    @Test
    void keepsNumbersWithZero() {
        assertArrayEquals(new int[]{10, 0, -205}, filter.filter(new int[]{10, 11, 0, -205, 99}));
    }

    @Test
    void emptyInput() {
        assertArrayEquals(new int[0], filter.filter(new int[0]));
    }
}
