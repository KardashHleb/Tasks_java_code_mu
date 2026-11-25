package org.example.level6_9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthLastWeekdayTest {

    @ParameterizedTest
    @CsvSource({"2026-11-25, Monday", "2026-12-01, Thursday", "2024-02-10, Thursday", "2026-02-10, Saturday"})
    void namesLastDayOfMonth(LocalDate today, String expected) {
        assertEquals(expected, new MonthLastWeekday().name(today));
    }
}
