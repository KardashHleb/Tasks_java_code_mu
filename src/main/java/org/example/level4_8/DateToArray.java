package org.example.level4_8;

public class DateToArray {
    public String[] convert(String date) {
        String year = "";
        String month = "";
        String day = "";
        int part = 0;

        for (int i = 0; i <= date.length(); i++) {
            if (i == date.length() || date.charAt(i) == '-') {
                part = part + 1;
            } else if (part == 0) {
                year = year + date.charAt(i);
            } else if (part == 1) {
                month = month + date.charAt(i);
            } else {
                day = day + date.charAt(i);
            }
        }

        String[] result = {day, month, year};
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
}
