package org.example.level6_9;

import java.time.LocalDate;

public class MonthLastWeekday {
    public String show() {
        LocalDate today = LocalDate.now();
        LocalDate last = today.withDayOfMonth(today.lengthOfMonth());
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
        String result = names[last.getDayOfWeek().getValue()];
        System.out.println(result);
        return result;
    }
}
