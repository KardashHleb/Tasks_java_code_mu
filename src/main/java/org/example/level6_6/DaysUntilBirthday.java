package org.example.level6_6;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DaysUntilBirthday {

    /** Returns the number of days until the next birthday (0 if it is today). */
    public long count(String birthDate) {
        return count(birthDate, LocalDate.now());
    }

    /**
     * Returns the number of days from the given "today" date until the next birthday (0 if it is today).
     * A February 29 birthday is celebrated on February 28 in non-leap years.
     */
    public long count(String birthDate, LocalDate today) {
        LocalDate birth;
        try {
            birth = LocalDate.parse(birthDate);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date, expected yyyy-MM-dd: " + birthDate, e);
        }
        if (birth.isAfter(today)) {
            throw new IllegalArgumentException("Birth date is in the future: " + birthDate);
        }
        // withYear moves February 29 to February 28 when the target year is not a leap year
        LocalDate next = birth.withYear(today.getYear());
        if (next.isBefore(today)) {
            next = birth.withYear(today.getYear() + 1);
        }
        return ChronoUnit.DAYS.between(today, next);
    }
}
