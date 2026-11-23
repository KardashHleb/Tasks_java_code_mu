package org.example.level6_8;

public class DateZeroPadder {
    public String pad(String date) {
        String year = "";
        String month = "";
        String day = "";
        int part = 0;

        for (int i = 0; i < date.length(); i++) {
            char current = date.charAt(i);
            if (current == '-') {
                part = part + 1;
            } else if (part == 0) {
                year = year + current;
            } else if (part == 1) {
                month = month + current;
            } else {
                day = day + current;
            }
        }

        if (month.length() == 1) {
            month = "0" + month;
        }
        if (day.length() == 1) {
            day = "0" + day;
        }

        String result = year + "-" + month + "-" + day;
        System.out.println(result);
        return result;
    }
}
