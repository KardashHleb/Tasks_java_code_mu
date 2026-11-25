package org.example.level6_3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateWeekdayFinder {

    /** Returns the English name of the day of the week of a date given as year-month-day. */
    public String find(String date) {
        try {
            return LocalDate.parse(date).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date, expected yyyy-MM-dd: " + date, e);
        }
    }
}
