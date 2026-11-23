package org.example.level6_7;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class YearWeekendsPrinter {
    public int print() {
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(today.getYear(), 1, 1);
        LocalDate end = LocalDate.of(today.getYear(), 12, 31);
        int count = 0;

        while (!date.isAfter(end)) {
            DayOfWeek day = date.getDayOfWeek();
            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                System.out.println(format(date));
                count = count + 1;
            }
            date = date.plusDays(1);
        }

        return count;
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
