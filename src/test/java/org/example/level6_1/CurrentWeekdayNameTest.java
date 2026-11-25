package org.example.level6_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CurrentWeekdayNameTest {

    @ParameterizedTest
    @CsvSource({"2026-11-23, Monday", "2026-11-25, Wednesday", "2026-11-29, Sunday", "2024-02-29, Thursday"})
    void namesWeekday(LocalDate today, String expected) {
        assertEquals(expected, new CurrentWeekdayName().name(today));
    }
}
