package org.example.level6_6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DaysUntilBirthdayTest {

    private final DaysUntilBirthday counter = new DaysUntilBirthday();

    @ParameterizedTest
    @CsvSource({
            "1990-11-25, 2026-11-25, 0",
            "1990-11-26, 2026-11-25, 1",
            "1990-11-24, 2026-11-25, 364",
            "1990-01-01, 2026-12-31, 1",
            "2000-02-29, 2026-01-01, 58",
            "2000-02-29, 2028-01-01, 59"
    })
    void countsDays(String birth, LocalDate today, long expected) {
        assertEquals(expected, counter.count(birth, today));
    }

    @Test
    void rejectsInvalidAndFutureDates() {
        LocalDate today = LocalDate.of(2026, 11, 25);
        assertThrows(IllegalArgumentException.class, () -> counter.count("1990-13-01", today));
        assertThrows(IllegalArgumentException.class, () -> counter.count("2027-01-01", today));
    }
}
