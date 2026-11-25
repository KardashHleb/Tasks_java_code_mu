package org.example.level6_10;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CurrentMonthCalendarTest {

    private final CurrentMonthCalendar calendar = new CurrentMonthCalendar();

    @Test
    void buildsNovember2026() {
        List<String> lines = calendar.lines(LocalDate.of(2026, 11, 25));
        assertEquals(30, lines.size());
        assertEquals("2026-11-01 weekend", lines.get(0));
        assertEquals("2026-11-02 weekday", lines.get(1));
        assertEquals("2026-11-25 weekday, today", lines.get(24));
        assertEquals("2026-11-30 weekday", lines.get(29));
    }

    @Test
    void leapFebruary() {
        List<String> lines = calendar.lines(LocalDate.of(2024, 2, 29));
        assertEquals(29, lines.size());
        assertEquals("2024-02-29 weekday, today", lines.get(28));
        assertEquals(1, lines.stream().filter(line -> line.endsWith("today")).count());
    }
}
