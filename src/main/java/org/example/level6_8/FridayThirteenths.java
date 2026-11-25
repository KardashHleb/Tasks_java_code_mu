package org.example.level6_8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FridayThirteenths {

    /** Finds all the 13th days of the given year that fall on a Friday. */
    public List<LocalDate> find(int year) {
        List<LocalDate> result = new ArrayList<>();
        for (int month = 1; month <= 12; month++) {
            LocalDate date = LocalDate.of(year, month, 13);
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                result.add(date);
            }
        }
        return result;
    }
}
