package org.example.level2_7;

public class DateFromArrayFormatter {
    public String format(String[] arr) {
        String date = arr[2] + "-" + arr[1] + "-" + arr[0];
        System.out.println(date);
        return date;
    }
}
