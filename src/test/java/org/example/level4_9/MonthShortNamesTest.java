package org.example.level4_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MonthShortNamesTest {

    private final MonthShortNames task = new MonthShortNames();

    @Test
    void convertsMonths() {
        assertArrayEquals(new String[]{"Jan", "May", "Dec"}, task.toNames(new byte[]{1, 5, 12}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new String[0], task.toNames(new byte[0]));
    }

    @Test
    void invalidMonthIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.toNames(new byte[]{1, 13}));
        assertThrows(IllegalArgumentException.class, () -> task.toNames(new byte[]{0}));
    }
}
