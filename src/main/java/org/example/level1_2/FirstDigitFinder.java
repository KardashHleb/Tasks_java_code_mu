package org.example.level1_2;

public class FirstDigitFinder {

    /** Returns the first (most significant) digit of the number (the sign is ignored). */
    public int firstDigit(int number) {
        return Long.toString(Math.abs((long) number)).charAt(0) - '0';
    }
}
