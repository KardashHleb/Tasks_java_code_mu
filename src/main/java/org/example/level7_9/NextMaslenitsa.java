package org.example.level7_9;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class NextMaslenitsa {
    public String date() {
        LocalDate today = LocalDate.now();
        LocalDate holiday = lastSundayOfFebruary(today.getYear());
        if (holiday.isBefore(today)) {
            holiday = lastSundayOfFebruary(today.getYear() + 1);
        }

        String month = "" + holiday.getMonthValue();
        String day = "" + holiday.getDayOfMonth();
        if (month.length() == 1) {
            month = "0" + month;
        }
        if (day.length() == 1) {
            day = "0" + day;
        }

        String result = holiday.getYear() + "-" + month + "-" + day;
        System.out.println(result);
        return result;
    }

    private LocalDate lastSundayOfFebruary(int year) {
        LocalDate date = LocalDate.of(year, 3, 1).minusDays(1);
        while (date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            date = date.minusDays(1);
        }
        return date;
    }
}
