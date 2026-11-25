package org.example.level6_5;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateCorrectnessChecker {

    /** Checks whether the text is an existing calendar date in the format year-month-day. */
    public boolean isCorrect(String date) {
        try {
            LocalDate.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
