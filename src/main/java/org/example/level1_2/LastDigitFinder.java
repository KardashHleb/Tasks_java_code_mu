package org.example.level1_2;

public class LastDigitFinder {

    /** Returns the last digit of the number (the sign is ignored). */
    public int lastDigit(int number) {
        return Math.abs(number % 10);
    }
}
