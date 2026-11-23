package org.example.level6_1;

import java.time.LocalDate;

public class CurrentDateShower {
    public String show() {
        LocalDate today = LocalDate.now();
        String month = twoDigits(today.getMonthValue());
        String day = twoDigits(today.getDayOfMonth());
        String result = today.getYear() + "-" + month + "-" + day;

        System.out.println(result);
        return result;
    }

    private String twoDigits(int value) {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
}
