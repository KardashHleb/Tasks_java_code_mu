package org.example.level6_10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {
    public long count(String firstDate, String secondDate) {
        System.out.println("Введите две даты");
        System.out.println(firstDate);
        System.out.println(secondDate);

        LocalDate first = LocalDate.parse(firstDate);
        LocalDate second = LocalDate.parse(secondDate);
        long result = ChronoUnit.DAYS.between(first, second);
        if (result < 0) {
            result = -result;
        }

        System.out.println(result);
        return result;
    }
}
