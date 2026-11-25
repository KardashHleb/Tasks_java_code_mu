package org.example.level5_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FirstDigitOneOrTwoFilterTest {

    private final FirstDigitOneOrTwoFilter filter = new FirstDigitOneOrTwoFilter();

    @Test
    void keepsNumbersStartingWithOneOrTwo() {
        assertArrayEquals(new int[]{12, 2, 199, -25}, filter.filter(new int[]{12, 35, 2, 199, 0, -25, 31}));
    }

    @Test
    void emptyArrayGivesEmptyResult() {
        assertArrayEquals(new int[0], filter.filter(new int[0]));
    }
}
