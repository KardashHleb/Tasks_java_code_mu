package org.example.level6_7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class YearWeekends {

    /** Returns all Saturdays and Sundays of the current year. */
    public List<LocalDate> list() {
        return list(Year.now().getValue());
    }

    /** Returns all Saturdays and Sundays of the given year in calendar order. */
    public List<LocalDate> list(int year) {
        List<LocalDate> weekends = new ArrayList<>();
        LocalDate date = LocalDate.of(year, 1, 1);
        LocalDate end = LocalDate.of(year, 12, 31);
        while (!date.isAfter(end)) {
            DayOfWeek day = date.getDayOfWeek();
            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                weekends.add(date);
            }
            date = date.plusDays(1);
        }
        return weekends;
    }
}
