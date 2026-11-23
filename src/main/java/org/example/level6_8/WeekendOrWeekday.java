package org.example.level6_8;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendOrWeekday {
    public String show() {
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        String result = "Будний";
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            result = "Выходной";
        }

        System.out.println(result);
        return result;
    }
}
