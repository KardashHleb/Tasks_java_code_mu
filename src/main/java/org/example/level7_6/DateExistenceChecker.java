package org.example.level7_6;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateExistenceChecker {

    /** Returns true if the text is a real calendar date in the yyyy-MM-dd format (2023-02-29 is not). */
    public boolean exists(String date) {
        try {
            LocalDate.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
