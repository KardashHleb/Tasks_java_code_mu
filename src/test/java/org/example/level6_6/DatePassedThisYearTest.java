package org.example.level6_6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DatePassedThisYearTest {

    private final DatePassedThisYear checker = new DatePassedThisYear();
    private final LocalDate today = LocalDate.of(2026, 11, 25);

    @ParameterizedTest
    @CsvSource({"2026-01-01, already passed", "2026-11-24, already passed", "2026-11-25, today", "2026-12-31, not yet"})
    void classifiesDate(String date, String expected) {
        assertEquals(expected, checker.check(date, today));
    }

    @Test
    void rejectsOtherYearAndInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> checker.check("2025-11-25", today));
        assertThrows(IllegalArgumentException.class, () -> checker.check("2026-02-30", today));
    }
}
