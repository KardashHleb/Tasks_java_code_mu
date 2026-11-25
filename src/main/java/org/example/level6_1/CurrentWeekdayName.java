package org.example.level6_1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CurrentWeekdayName {

    /** Returns the English name of the current day of the week. */
    public String name() {
        return name(LocalDate.now());
    }

    /** Returns the English name of the day of the week of the given "today" date. */
    public String name(LocalDate today) {
        return today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
