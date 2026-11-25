package org.example.level6_10;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {

    /** Returns the number of days between two year-month-day dates, regardless of their order. */
    public long count(String firstDate, String secondDate) {
        LocalDate first = parse(firstDate);
        LocalDate second = parse(secondDate);
        return Math.abs(ChronoUnit.DAYS.between(first, second));
    }

    private LocalDate parse(String date) {
        try {
            return LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date, expected yyyy-MM-dd: " + date, e);
        }
    }
}
