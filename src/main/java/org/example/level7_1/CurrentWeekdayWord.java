package org.example.level7_1;

import java.time.LocalDate;

public class CurrentWeekdayWord {
    public String weekday() {
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
        String result = names[LocalDate.now().getDayOfWeek().getValue()];
        System.out.println(result);
        return result;
    }
}
