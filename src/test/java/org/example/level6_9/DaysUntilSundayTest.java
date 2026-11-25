package org.example.level6_9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DaysUntilSundayTest {

    @ParameterizedTest
    @CsvSource({"2026-11-23, 6", "2026-11-25, 4", "2026-11-28, 1", "2026-11-29, 0"})
    void countsDays(LocalDate today, int expected) {
        assertEquals(expected, new DaysUntilSunday().count(today));
    }
}
