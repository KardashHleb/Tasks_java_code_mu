package org.example.level6_6;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DatePassedThisYear {

    /** Tells whether a date of the current year has already passed: "already passed", "today" or "not yet". */
    public String check(String date) {
        return check(date, LocalDate.now());
    }

    /** Same as {@link #check(String)} relative to the given "today" date. */
    public String check(String date, LocalDate today) {
        LocalDate value;
        try {
            value = LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date, expected yyyy-MM-dd: " + date, e);
        }
        if (value.getYear() != today.getYear()) {
            throw new IllegalArgumentException("The date is not in the current year: " + date);
        }
        if (value.isBefore(today)) {
            return "already passed";
        }
        if (value.isEqual(today)) {
            return "today";
        }
        return "not yet";
    }
}
