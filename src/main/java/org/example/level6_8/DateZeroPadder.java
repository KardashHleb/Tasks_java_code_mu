package org.example.level6_8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class DateZeroPadder {

    private static final DateTimeFormatter INPUT =
            DateTimeFormatter.ofPattern("uuuu-M-d").withResolverStyle(ResolverStyle.STRICT);

    /** Adds leading zeros to the month and day of a year-month-day date: 2025-1-5 becomes 2025-01-05. */
    public String pad(String date) {
        try {
            return DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.parse(date, INPUT));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date, expected year-month-day: " + date, e);
        }
    }
}
