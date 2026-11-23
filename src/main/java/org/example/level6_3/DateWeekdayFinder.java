package org.example.level6_3;

import java.time.LocalDate;

public class DateWeekdayFinder {
    public String find(String dateText) {
        System.out.println("Введите дату в формате год-месяц-день");
        System.out.println(dateText);

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
