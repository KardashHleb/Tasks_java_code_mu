package org.example.level9_5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FridayThirteenthsYear {

    /** All Fridays the 13th of the given year. */
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

    /** Number of Fridays the 13th in the given year. */
    public int count(int year) {
        return find(year).size();
    }
}
