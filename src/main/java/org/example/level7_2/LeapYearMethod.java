package org.example.level7_2;

public class LeapYearMethod {

    /** Returns true if the year is a leap year in the Gregorian calendar. */
    public boolean isLeap(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
