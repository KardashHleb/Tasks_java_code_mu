package org.example.level6_9;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthLastWeekday {

    /** Returns the English name of the day of the week of the last day of the current month. */
    public String name() {
        return name(LocalDate.now());
    }

    /** Returns the English name of the day of the week of the last day of the month of the given date. */
    public String name(LocalDate today) {
        LocalDate last = today.withDayOfMonth(today.lengthOfMonth());
        return last.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
