package org.example.level3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LongNumbersFilterTest {

    private final LongNumbersFilter filter = new LongNumbersFilter();

    @Test
    void keepsNumbersWithFourOrMoreDigits() {
        assertArrayEquals(new int[]{1000, 12345, -5000}, filter.filter(new int[]{999, 1000, 12345, -5000, -999}));
    }

    @Test
    void emptyInput() {
        assertArrayEquals(new int[0], filter.filter(new int[0]));
    }
}
