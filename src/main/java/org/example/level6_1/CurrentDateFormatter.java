package org.example.level6_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateFormatter {

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /** Returns today's date in the format year-month-day with leading zeros. */
    public String format() {
        return format(LocalDate.now());
    }

    /** Formats the given "today" date as year-month-day with leading zeros. */
    public String format(LocalDate today) {
        return FORMAT.format(today);
    }
}
