package org.example.level7_4;

import java.time.LocalDate;

public class ZodiacByDate {
    public String sign(String dateText) {
        LocalDate date = LocalDate.parse(dateText);
        int monthDay = date.getMonthValue() * 100 + date.getDayOfMonth();
        String result;

        if (monthDay >= 1222 || monthDay <= 119) {
            result = "козерог";
        } else if (monthDay <= 218) {
            result = "водолей";
        } else if (monthDay <= 320) {
            result = "рыбы";
        } else if (monthDay <= 419) {
            result = "овен";
        } else if (monthDay <= 520) {
            result = "телец";
        } else if (monthDay <= 620) {
            result = "близнецы";
        } else if (monthDay <= 722) {
            result = "рак";
        } else if (monthDay <= 822) {
            result = "лев";
        } else if (monthDay <= 922) {
            result = "дева";
        } else if (monthDay <= 1022) {
            result = "весы";
        } else if (monthDay <= 1121) {
            result = "скорпион";
        } else {
            result = "стрелец";
        }

        System.out.println(result);
        return result;
    }
}
