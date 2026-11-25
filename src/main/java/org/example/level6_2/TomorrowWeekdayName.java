package org.example.level6_2;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class TomorrowWeekdayName {

    /** Returns the English name of tomorrow's day of the week. */
    public String name() {
        return name(LocalDate.now());
    }

    /** Returns the English name of the day of the week that follows the given "today" date. */
    public String name(LocalDate today) {
        return today.plusDays(1).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
