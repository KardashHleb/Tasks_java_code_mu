package org.example.level6_5;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FullYearsCounterTest {

    private final FullYearsCounter counter = new FullYearsCounter();
    private final LocalDate today = LocalDate.of(2026, 11, 25);

    @Test
    void countsFullYears() {
        assertEquals(36, counter.count("1990-11-25", today));
        assertEquals(35, counter.count("1990-11-26", today));
    }

    @Test
    void leapDayBirth() {
        assertEquals(3, counter.count("2020-02-29", LocalDate.of(2024, 2, 28)));
        assertEquals(4, counter.count("2020-02-29", LocalDate.of(2024, 2, 29)));
    }

    @Test
    void rejectsFutureAndInvalidDates() {
        assertThrows(IllegalArgumentException.class, () -> counter.count("2030-01-01", today));
        assertThrows(IllegalArgumentException.class, () -> counter.count("1990-02-30", today));
    }
}
