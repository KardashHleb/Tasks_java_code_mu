package org.example.level7_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class MonthEndDaysTest {

    private final MonthEndDays task = new MonthEndDays();

    @Test
    void countsDaysLeft() {
        assertEquals(5, task.daysLeft(LocalDate.of(2026, 11, 25)));
    }

    @Test
    void handlesLastDayAndLeapFebruary() {
        assertEquals(0, task.daysLeft(LocalDate.of(2026, 12, 31)));
        assertEquals(28, task.daysLeft(LocalDate.of(2024, 2, 1)));
    }
}
