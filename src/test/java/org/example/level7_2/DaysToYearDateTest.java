package org.example.level7_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.time.MonthDay;
import org.junit.jupiter.api.Test;

class DaysToYearDateTest {

    private final DaysToYearDate task = new DaysToYearDate();
    private final LocalDate today = LocalDate.of(2026, 11, 25);

    @Test
    void countsDaysAhead() {
        assertEquals(6, task.daysUntil(MonthDay.of(12, 1), today));
    }

    @Test
    void returnsNegativeForPassedDateAndZeroForToday() {
        assertEquals(-24, task.daysUntil(MonthDay.of(11, 1), today));
        assertEquals(0, task.daysUntil(MonthDay.of(11, 25), today));
    }

    @Test
    void rejectsLeapDayInCommonYear() {
        assertThrows(IllegalArgumentException.class, () -> task.daysUntil(MonthDay.of(2, 29), today));
    }
}
