package org.example.level3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DivisibleByFiveFilterTest {

    private final DivisibleByFiveFilter filter = new DivisibleByFiveFilter();

    @Test
    void keepsMultiplesOfFive() {
        assertArrayEquals(new int[]{5, 10, 0, -15}, filter.filter(new int[]{1, 5, 7, 10, 0, -15, 22}));
    }

    @Test
    void noMatchesGivesEmptyArray() {
        assertArrayEquals(new int[0], filter.filter(new int[]{1, 2, 3}));
    }

    @Test
    void emptyInput() {
        assertArrayEquals(new int[0], filter.filter(new int[0]));
    }
}
