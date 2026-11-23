package org.example.level9_5;

import java.time.LocalDate;

public class FourTwosDates {
    public String[] find() {
        int count = 0;
        for (int year = 2001; year <= 2100; year++) {
            for (int month = 1; month <= 12; month++) {
                int days = LocalDate.of(year, month, 1).lengthOfMonth();
                for (int day = 1; day <= days; day++) {
                    if (twos(day, month, year) == 4) {
                        count = count + 1;
                    }
                }
            }
        }

        String[] result = new String[count];
        int index = 0;
        for (int year = 2001; year <= 2100; year++) {
            for (int month = 1; month <= 12; month++) {
                int days = LocalDate.of(year, month, 1).lengthOfMonth();
                for (int day = 1; day <= days; day++) {
                    if (twos(day, month, year) == 4) {
                        result[index] = two(day) + "." + two(month) + "." + year;
                        System.out.println(result[index]);
                        index = index + 1;
                    }
                }
            }
        }
        return result;
    }

    private int twos(int day, int month, int year) {
        String date = two(day) + "." + two(month) + "." + year;
        int count = 0;
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) == '2') {
                count = count + 1;
            }
        }
        return count;
    }

    private String two(int value) {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
}
