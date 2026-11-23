package org.example.level6_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CurrentWeekdayShower {
    public String show() {
        String result = weekdayName(LocalDate.now().getDayOfWeek());
        System.out.println(result);
        return result;
    }

    private String weekdayName(DayOfWeek day) {
        String[] names = {
                "",
                "понедельник",
                "вторник",
                "среда",
                "четверг",
                "пятница",
                "суббота",
                "воскресенье"
        };
        return names[day.getValue()];
    }
}
