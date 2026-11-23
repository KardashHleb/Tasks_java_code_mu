package org.example.level6_8;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayThirteenths {
    public String show(int year) {
        System.out.println("Введите год");
        System.out.println(year);

        String result = "";
        for (int month = 1; month <= 12; month++) {
            LocalDate date = LocalDate.of(year, month, 13);
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                if (result.length() > 0) {
                    result = result + "\n";
                }
                result = result + format(date);
            }
        }

        if (result.length() == 0) {
            System.out.println("Пятниц 13-го нет");
        } else {
            System.out.println(result);
        }
        return result;
    }

    private String format(LocalDate date) {
        String month = "" + date.getMonthValue();
        String day = "" + date.getDayOfMonth();
        if (month.length() == 1) {
            month = "0" + month;
        }
        if (day.length() == 1) {
            day = "0" + day;
        }
        return date.getYear() + "-" + month + "-" + day;
    }
}
