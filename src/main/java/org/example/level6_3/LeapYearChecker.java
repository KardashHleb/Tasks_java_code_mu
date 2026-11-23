package org.example.level6_3;

public class LeapYearChecker {
    public boolean isLeap(int year) {
        System.out.println("Введите год");
        System.out.println(year);

        boolean leap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        if (leap) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
        return leap;
    }
}
