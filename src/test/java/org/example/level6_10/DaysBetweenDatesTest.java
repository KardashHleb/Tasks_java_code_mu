package org.example.level6_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DaysBetweenDatesTest {

    private final DaysBetweenDates counter = new DaysBetweenDates();

    @ParameterizedTest
    @CsvSource({"2026-01-01, 2026-12-31, 364", "2026-12-31, 2026-01-01, 364", "2024-02-28, 2024-03-01, 2",
            "2026-11-25, 2026-11-25, 0"})
    void countsDays(String first, String second, long expected) {
        assertEquals(expected, counter.count(first, second));
    }

    @Test
    void rejectsInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> counter.count("2026-11-31", "2026-12-01"));
    }
}
