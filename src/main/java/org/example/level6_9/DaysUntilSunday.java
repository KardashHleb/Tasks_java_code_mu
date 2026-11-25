package org.example.level6_9;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DaysUntilSunday {

    /** Returns the number of days left until the nearest Sunday (0 on Sunday). */
    public int count() {
        return count(LocalDate.now());
    }

    /** Returns the number of days from the given "today" date until the nearest Sunday (0 on Sunday). */
    public int count(LocalDate today) {
        return DayOfWeek.SUNDAY.getValue() - today.getDayOfWeek().getValue();
    }
}
