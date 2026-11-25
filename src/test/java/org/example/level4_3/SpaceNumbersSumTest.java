package org.example.level4_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SpaceNumbersSumTest {

    private final SpaceNumbersSum task = new SpaceNumbersSum();

    @Test
    void sumsNumbers() {
        assertEquals(10, task.sum("1 2 3 4"));
    }

    @Test
    void extraSpacesAndNegatives() {
        assertEquals(5, task.sum("  10   -5 "));
    }

    @Test
    void blankGivesZero() {
        assertEquals(0, task.sum("  "));
    }

    @Test
    void nonNumberIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.sum("1 two"));
    }
}
