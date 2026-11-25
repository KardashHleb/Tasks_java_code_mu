package org.example.level6_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TomorrowWeekdayNameTest {

    @ParameterizedTest
    @CsvSource({"2026-11-25, Thursday", "2026-11-29, Monday", "2026-12-31, Friday"})
    void namesTomorrow(LocalDate today, String expected) {
        assertEquals(expected, new TomorrowWeekdayName().name(today));
    }
}
