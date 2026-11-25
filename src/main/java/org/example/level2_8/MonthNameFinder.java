package org.example.level2_8;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthNameFinder {

    /** Returns the English name of the month with the given number (1-12). */
    public String monthName(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month number must be between 1 and 12: " + month);
        }
        return Month.of(month).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
