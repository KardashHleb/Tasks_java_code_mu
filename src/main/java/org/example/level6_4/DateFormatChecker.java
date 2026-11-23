package org.example.level6_4;

public class DateFormatChecker {
    public boolean isCorrectFormat(String text) {
        System.out.println("Введите дату в формате год-месяц-день");
        System.out.println(text);

        String year = "";
        String month = "";
        String day = "";
        int part = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == '-') {
                part = part + 1;
                if (part > 2) {
                    System.out.println("Формат некорректен");
                    return false;
                }
            } else if (part == 0) {
                year = year + current;
            } else if (part == 1) {
                month = month + current;
            } else {
                day = day + current;
            }
        }

        if (part != 2 || !onlyDigits(year, 4) || !onlyDigits(month, 2) || !onlyDigits(day, 2)) {
            System.out.println("Формат некорректен");
            return false;
        }

        System.out.println("Формат корректен");
        return true;
    }

    private boolean onlyDigits(String text, int length) {
        if (text.length() != length) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current < '0' || current > '9') {
                return false;
            }
        }
        return true;
    }
}
