package org.example.level6_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DaysUntilNewYearTest {

    @ParameterizedTest
    @CsvSource({"2026-12-31, 1", "2026-01-01, 365", "2024-01-01, 366", "2026-11-25, 37"})
    void countsDays(LocalDate today, long expected) {
        assertEquals(expected, new DaysUntilNewYear().count(today));
    }
}
