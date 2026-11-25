package org.example.level6_5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class FullYearsCounter {

    /** Returns the number of full years that have passed since the birth date (year-month-day). */
    public int count(String birthDate) {
        return count(birthDate, LocalDate.now());
    }

    /** Returns the number of full years between the birth date (year-month-day) and the given "today" date. */
    public int count(String birthDate, LocalDate today) {
        LocalDate birth;
        try {
            birth = LocalDate.parse(birthDate);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date, expected yyyy-MM-dd: " + birthDate, e);
        }
        if (birth.isAfter(today)) {
            throw new IllegalArgumentException("Birth date is in the future: " + birthDate);
        }
        return Period.between(birth, today).getYears();
    }
}
