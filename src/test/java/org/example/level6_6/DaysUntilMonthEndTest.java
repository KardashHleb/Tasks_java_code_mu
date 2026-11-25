package org.example.level6_6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DaysUntilMonthEndTest {

    @ParameterizedTest
    @CsvSource({"2026-11-25, 5", "2026-11-30, 0", "2024-02-01, 28", "2026-02-01, 27", "2026-01-01, 30"})
    void countsDaysLeft(LocalDate today, int expected) {
        assertEquals(expected, new DaysUntilMonthEnd().count(today));
    }
}
