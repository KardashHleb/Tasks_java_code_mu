package org.example.level1_2;

public class DigitCounter {

    /** Returns the number of digits in the number (the sign is ignored). */
    public int countDigits(int number) {
        return Long.toString(Math.abs((long) number)).length();
    }
}
