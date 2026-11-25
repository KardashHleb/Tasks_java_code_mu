package org.example.level7_9;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class NextLastSundayOfWinter {

    /** Returns the date of the next last Sunday of winter (the last Sunday of February), today included. */
    public LocalDate nextDate() {
        return nextDate(LocalDate.now());
    }

    /** Returns the last Sunday of February that falls on or after {@code today}. */
    public LocalDate nextDate(LocalDate today) {
        LocalDate date = lastSundayOfFebruary(today.getYear());
        if (date.isBefore(today)) {
            date = lastSundayOfFebruary(today.getYear() + 1);
        }
        return date;
    }

    private LocalDate lastSundayOfFebruary(int year) {
        LocalDate date = LocalDate.of(year, 3, 1).minusDays(1);
        while (date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            date = date.minusDays(1);
        }
        return date;
    }
}
