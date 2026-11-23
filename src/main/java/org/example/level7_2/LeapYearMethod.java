package org.example.level7_2;

public class LeapYearMethod {
    public boolean isLeap(int year) {
        boolean result = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        if (result) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
        return result;
    }
}
