package org.example.level9_9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JanuaryWeekendCounter {

    /** Years in the range (inclusive) in which January 1st falls on a Saturday or a Sunday. */
    public List<Integer> years(int fromYear, int toYear) {
        if (fromYear > toYear) {
            throw new IllegalArgumentException("Start year " + fromYear + " is after end year " + toYear);
        }
        List<Integer> result = new ArrayList<>();
        for (int year = fromYear; year <= toYear; year++) {
            DayOfWeek weekday = LocalDate.of(year, 1, 1).getDayOfWeek();
            if (weekday == DayOfWeek.SATURDAY || weekday == DayOfWeek.SUNDAY) {
                result.add(year);
            }
        }
        return result;
    }

    /** Number of years in the range (inclusive) in which January 1st falls on a weekend. */
    public int count(int fromYear, int toYear) {
        return years(fromYear, toYear).size();
    }
}
