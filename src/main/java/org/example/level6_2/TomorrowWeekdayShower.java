package org.example.level6_2;

import java.time.LocalDate;

public class TomorrowWeekdayShower {
    public String show() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
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
        String result = names[tomorrow.getDayOfWeek().getValue()];
        System.out.println(result);
        return result;
    }
}
