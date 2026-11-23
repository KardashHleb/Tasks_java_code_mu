package org.example.level9_5;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayThirteenthsYear {
    public int count() {
        int year = LocalDate.now().getYear();
        int result = 0;

        for (int month = 1; month <= 12; month++) {
            LocalDate date = LocalDate.of(year, month, 13);
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println(two(date.getDayOfMonth()) + "." + two(date.getMonthValue()) + "." + date.getYear());
                result = result + 1;
            }
        }

        System.out.println(result);
        return result;
    }

    private String two(int value) {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
}
