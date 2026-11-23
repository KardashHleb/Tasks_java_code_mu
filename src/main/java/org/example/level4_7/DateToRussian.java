package org.example.level4_7;

public class DateToRussian {
    public String convert(String date) {
        String day = "";
        String month = "";
        String year = "";
        int part = 0;

        for (int i = 0; i <= date.length(); i++) {
            if (i == date.length() || date.charAt(i) == '-') {
                part = part + 1;
            } else if (part == 0) {
                day = day + date.charAt(i);
            } else if (part == 1) {
                month = month + date.charAt(i);
            } else {
                year = year + date.charAt(i);
            }
        }

        String[] months = {
                "января", "февраля", "марта", "апреля",
                "мая", "июня", "июля", "августа",
                "сентября", "октября", "ноября", "декабря"
        };
        int monthNumber = Integer.parseInt(month);
        String result = day + " " + months[monthNumber - 1] + " " + year;
        System.out.println(result);
        return result;
    }
}
