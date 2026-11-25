package org.example.level7_2;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

public class DaysToYearDate {

    /** Returns the signed number of days from today to the given month and day of the current year. */
    public long daysUntil(MonthDay monthDay) {
        return daysUntil(monthDay, LocalDate.now());
    }

    /**
     * Returns the signed number of days from {@code today} to the given month and day of the same year:
     * positive if the date is still ahead, negative if it has passed, zero if it is today.
     */
    public long daysUntil(MonthDay monthDay, LocalDate today) {
        if (!monthDay.isValidYear(today.getYear())) {
            throw new IllegalArgumentException(monthDay + " does not exist in " + today.getYear());
        }
        return ChronoUnit.DAYS.between(today, monthDay.atYear(today.getYear()));
    }
}
