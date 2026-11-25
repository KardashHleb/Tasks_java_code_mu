package org.example.level6_10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CurrentMonthCalendar {

    /** Returns the calendar of the current month; see {@link #lines(LocalDate)}. */
    public List<String> lines() {
        return lines(LocalDate.now());
    }

    /**
     * Returns one line per day of the month of the given "today" date, such as "2026-11-25 weekday, today":
     * the date, "weekend" or "weekday", and the mark ", today" for the given date.
     */
    public List<String> lines(LocalDate today) {
        List<String> result = new ArrayList<>();
        LocalDate date = today.withDayOfMonth(1);
        while (date.getMonth() == today.getMonth()) {
            DayOfWeek day = date.getDayOfWeek();
            String kind = day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY ? "weekend" : "weekday";
            String line = DateTimeFormatter.ISO_LOCAL_DATE.format(date) + " " + kind;
            result.add(date.equals(today) ? line + ", today" : line);
            date = date.plusDays(1);
        }
        return result;
    }
}
