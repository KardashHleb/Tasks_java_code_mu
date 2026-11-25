package org.example.level7_9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class NextLastSundayOfWinterTest {

    private final NextLastSundayOfWinter task = new NextLastSundayOfWinter();

    @Test
    void returnsDateOfCurrentYearIfStillAhead() {
        assertEquals(LocalDate.of(2026, 2, 22), task.nextDate(LocalDate.of(2026, 1, 10)));
    }

    @Test
    void returnsNextYearDateIfAlreadyPassed() {
        assertEquals(LocalDate.of(2027, 2, 28), task.nextDate(LocalDate.of(2026, 11, 25)));
    }

    @Test
    void includesTodayAndLeapDay() {
        assertEquals(LocalDate.of(2026, 2, 22), task.nextDate(LocalDate.of(2026, 2, 22)));
        assertEquals(LocalDate.of(2032, 2, 29), task.nextDate(LocalDate.of(2032, 1, 1)));
    }
}
