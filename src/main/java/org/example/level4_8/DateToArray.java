package org.example.level4_8;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateToArray {

    /** Splits a date in the "yyyy-mm-dd" format into {day, month, year}, e.g. "2025-12-31" gives {"31", "12", "2025"}. */
    public String[] convert(String date) {
        try {
            LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Expected a valid date in the yyyy-mm-dd format, got \"" + date + "\"", e);
        }
        String[] parts = date.split("-");
        return new String[]{parts[2], parts[1], parts[0]};
    }
}
