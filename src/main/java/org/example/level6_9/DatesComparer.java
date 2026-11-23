package org.example.level6_9;

import java.time.LocalDate;

public class DatesComparer {
    public String compare(String date1, String date2) {
        LocalDate first = LocalDate.parse(date1);
        LocalDate second = LocalDate.parse(date2);
        String result;

        if (first.isAfter(second)) {
            result = date1 + " больше";
        } else if (second.isAfter(first)) {
            result = date2 + " больше";
        } else {
            result = "Даты равны";
        }

        System.out.println(result);
        return result;
    }
}
