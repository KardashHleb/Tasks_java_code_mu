package org.example.level5_4;

public class AscendingDigitsChecker {

    /** Checks whether the digits of the number go in strictly ascending order from left to right. */
    public boolean isAscending(int number) {
        long value = Math.abs((long) number);
        long next = value % 10;
        value /= 10;
        while (value > 0) {
            long digit = value % 10;
            if (digit >= next) {
                return false;
            }
            next = digit;
            value /= 10;
        }
        return true;
    }
}
