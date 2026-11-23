package org.example.level9_9;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class JanuaryWeekendCounter {
    public int count() {
        int current = LocalDate.now().getYear();
        int result = 0;

        for (int year = 2000; year <= current; year++) {
            DayOfWeek weekday = LocalDate.of(year, 1, 1).getDayOfWeek();
            if (weekday == DayOfWeek.SATURDAY || weekday == DayOfWeek.SUNDAY) {
                System.out.println(year);
                result = result + 1;
            }
        }

        System.out.println(result);
        return result;
    }
}
