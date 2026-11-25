package org.example.level1_7;

public class DigitsSumFinder {

    /** Returns the sum of the digits of the number (the sign is ignored). */
    public int sumDigits(int number) {
        long rest = Math.abs((long) number);
        int sum = 0;
        while (rest > 0) {
            sum += (int) (rest % 10);
            rest /= 10;
        }
        return sum;
    }
}
