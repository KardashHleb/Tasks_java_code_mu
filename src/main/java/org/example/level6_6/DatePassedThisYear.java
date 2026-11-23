package org.example.level6_6;

import java.time.LocalDate;

public class DatePassedThisYear {
    public String check(String dateText) {
        System.out.println("Введите дату в формате год-месяц-день");
        System.out.println(dateText);

        LocalDate date = LocalDate.parse(dateText);
        LocalDate today = LocalDate.now();

        if (date.getYear() != today.getYear()) {
            System.out.println("Дата не в текущем году");
            return "Дата не в текущем году";
        }

        if (date.isBefore(today)) {
            System.out.println("Уже была");
            return "Уже была";
        }

        if (date.isEqual(today)) {
            System.out.println("Сегодня");
            return "Сегодня";
        }

        System.out.println("Еще не была");
        return "Еще не была";
    }
}
