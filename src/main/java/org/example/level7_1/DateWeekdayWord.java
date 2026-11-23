package org.example.level7_1;

import java.time.LocalDate;

public class DateWeekdayWord {
    public String weekday(String dateText) {
        LocalDate date = LocalDate.parse(dateText);
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
        String result = names[date.getDayOfWeek().getValue()];
        System.out.println(result);
        return result;
    }
}
