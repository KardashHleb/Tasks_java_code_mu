package org.example.level6_1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CurrentDateFormatterTest {

    private final CurrentDateFormatter formatter = new CurrentDateFormatter();

    @Test
    void padsMonthAndDay() {
        assertEquals("2026-03-07", formatter.format(LocalDate.of(2026, 3, 7)));
    }

    @Test
    void keepsTwoDigitValues() {
        assertEquals("2025-12-31", formatter.format(LocalDate.of(2025, 12, 31)));
    }

    @Test
    void noArgVersionUsesToday() {
        assertEquals(LocalDate.now().toString(), formatter.format());
    }
}
