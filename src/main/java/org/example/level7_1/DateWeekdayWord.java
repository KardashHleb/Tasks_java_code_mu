package org.example.level7_1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateWeekdayWord {

    private static final String[] NAMES = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    /** Returns the English weekday name of a date given as yyyy-MM-dd. */
    public String weekday(String dateText) {
        LocalDate date;
        try {
            date = LocalDate.parse(dateText);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date, expected yyyy-MM-dd: " + dateText, e);
        }
        return NAMES[date.getDayOfWeek().getValue() - 1];
    }
}
