package org.example.level6_2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateValueChecker {

    /** Checks whether the text is an existing date in the format year-month-day. */
    public boolean isCorrect(String date) {
        try {
            LocalDate.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
