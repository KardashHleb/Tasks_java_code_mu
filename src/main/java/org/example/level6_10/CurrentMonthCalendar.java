package org.example.level6_10;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CurrentMonthCalendar {
    public String show() {
        LocalDate today = LocalDate.now();
        int days = today.lengthOfMonth();
        String result = "";

        for (int day = 1; day <= days; day++) {
            LocalDate date = LocalDate.of(today.getYear(), today.getMonth(), day);
            if (day > 1) {
                result = result + "\n";
            }
            result = result + format(date);
            DayOfWeek weekday = date.getDayOfWeek();
            if (weekday == DayOfWeek.SATURDAY || weekday == DayOfWeek.SUNDAY) {
                result = result + " выходной";
            } else {
                result = result + " будний";
            }
            if (date.equals(today)) {
                result = result + ", сегодня";
            }
        }

        System.out.println(result);
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
