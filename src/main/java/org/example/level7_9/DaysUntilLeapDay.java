package org.example.level7_9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysUntilLeapDay {

    /** Returns how many days are left until the nearest February 29. */
    public long count() {
        return count(LocalDate.now());
    }

    /** Returns how many days are left from {@code today} until the nearest February 29 (0 if today is one). */
    public long count(LocalDate today) {
        int year = today.getYear();
        while (!isLeap(year) || today.isAfter(LocalDate.of(year, 2, 29))) {
            year++;
        }
        return ChronoUnit.DAYS.between(today, LocalDate.of(year, 2, 29));
    }

    private boolean isLeap(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
