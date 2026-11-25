package org.example.level6_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DatesComparerTest {

    private final DatesComparer comparer = new DatesComparer();

    @Test
    void tellsWhichDateIsLater() {
        assertEquals("2026-01-02 is later", comparer.compare("2026-01-02", "2025-12-31"));
        assertEquals("2026-03-01 is later", comparer.compare("2026-02-28", "2026-03-01"));
    }

    @Test
    void equalDates() {
        assertEquals("The dates are equal", comparer.compare("2026-11-25", "2026-11-25"));
    }

    @Test
    void rejectsInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> comparer.compare("2026-11-25", "yesterday"));
    }
}
