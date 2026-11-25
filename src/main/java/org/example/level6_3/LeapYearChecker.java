package org.example.level6_3;

public class LeapYearChecker {

    /** Checks whether the year is a leap year in the Gregorian calendar. */
    public boolean isLeap(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
