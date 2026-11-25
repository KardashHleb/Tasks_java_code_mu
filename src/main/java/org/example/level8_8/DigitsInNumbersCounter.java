package org.example.level8_8;

public class DigitsInNumbersCounter {

    /** Returns the total number of digits in all numbers of the array (0 counts as one digit, signs are ignored). */
    public int count(int[] values) {
        int result = 0;
        for (int value : values) {
            long rest = Math.abs((long) value);
            do {
                result++;
                rest /= 10;
            } while (rest > 0);
        }
        return result;
    }
}
