package org.example.level7_9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class DaysUntilLeapDayTest {

    private final DaysUntilLeapDay task = new DaysUntilLeapDay();

    @Test
    void countsDaysToLeapDayInLaterYear() {
        assertEquals(461, task.count(LocalDate.of(2026, 11, 25)));
    }

    @Test
    void countsWithinLeapYear() {
        assertEquals(28, task.count(LocalDate.of(2024, 2, 1)));
        assertEquals(0, task.count(LocalDate.of(2024, 2, 29)));
    }

    @Test
    void skipsCenturyYearThatIsNotLeap() {
        assertEquals(LocalDate.of(2096, 3, 1).datesUntil(LocalDate.of(2104, 2, 29)).count(),
                task.count(LocalDate.of(2096, 3, 1)));
    }
}
