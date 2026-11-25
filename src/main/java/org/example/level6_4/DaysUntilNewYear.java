package org.example.level6_4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysUntilNewYear {

    /** Returns the number of days left until the next New Year. */
    public long count() {
        return count(LocalDate.now());
    }

    /** Returns the number of days from the given "today" date until January 1 of the next year. */
    public long count(LocalDate today) {
        LocalDate newYear = LocalDate.of(today.getYear() + 1, 1, 1);
        return ChronoUnit.DAYS.between(today, newYear);
    }
}
