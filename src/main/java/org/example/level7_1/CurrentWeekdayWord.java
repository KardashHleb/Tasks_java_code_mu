package org.example.level7_1;

import java.time.LocalDate;

public class CurrentWeekdayWord {

    private static final String[] NAMES = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    /** Returns the English name of the current day of the week. */
    public String weekday() {
        return weekday(LocalDate.now());
    }

    /** Returns the English name of the day of the week of the given date. */
    public String weekday(LocalDate today) {
        return NAMES[today.getDayOfWeek().getValue() - 1];
    }
}
