package org.example.level6_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateWeekdayFinderTest {

    private final DateWeekdayFinder finder = new DateWeekdayFinder();

    @ParameterizedTest
    @CsvSource({"2000-01-01, Saturday", "2024-02-29, Thursday", "2026-11-25, Wednesday"})
    void findsWeekday(String date, String expected) {
        assertEquals(expected, finder.find(date));
    }

    @Test
    void rejectsInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> finder.find("2023-02-29"));
    }
}
