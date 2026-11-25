package org.example.level6_9;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DatesComparer {

    /** Compares two year-month-day dates and tells which one is later, or that they are equal. */
    public String compare(String firstDate, String secondDate) {
        LocalDate first = parse(firstDate);
        LocalDate second = parse(secondDate);
        if (first.isAfter(second)) {
            return firstDate + " is later";
        }
        if (second.isAfter(first)) {
            return secondDate + " is later";
        }
        return "The dates are equal";
    }

    private LocalDate parse(String date) {
        try {
            return LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date, expected yyyy-MM-dd: " + date, e);
        }
    }
}
