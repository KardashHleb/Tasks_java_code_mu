package org.example.level7_2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysToYearDate {
    public long count(String dateText) {
        LocalDate entered = LocalDate.parse(dateText);
        LocalDate today = LocalDate.now();
        int month = entered.getMonthValue();
        int day = entered.getDayOfMonth();
        if (month == 2 && day == 29 && !isLeap(today.getYear())) {
            System.out.println("В этом году такой даты нет");
            return 0;
        }

        LocalDate target = LocalDate.of(today.getYear(), month, day);
        long result = ChronoUnit.DAYS.between(today, target);

        if (result > 0) {
            System.out.println("Осталось " + result);
        } else if (result < 0) {
            System.out.println("Прошло " + (-result));
        } else {
            System.out.println("Сегодня");
        }

        return result;
    }

    private boolean isLeap(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
