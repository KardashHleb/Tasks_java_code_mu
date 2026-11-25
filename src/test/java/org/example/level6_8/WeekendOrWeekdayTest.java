package org.example.level6_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeekendOrWeekdayTest {

    @ParameterizedTest
    @CsvSource({"2026-11-23, weekday", "2026-11-27, weekday", "2026-11-28, weekend", "2026-11-29, weekend"})
    void classifiesDay(LocalDate today, String expected) {
        assertEquals(expected, new WeekendOrWeekday().classify(today));
    }
}
