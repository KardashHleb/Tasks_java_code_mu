package org.example.level8_7;

public class DigitThreeCounter {

    /** Returns how many times the digit 3 occurs in all numbers of the array together. */
    public int count(int[] values) {
        int result = 0;
        for (int value : values) {
            long rest = Math.abs((long) value);
            while (rest > 0) {
                if (rest % 10 == 3) {
                    result++;
                }
                rest /= 10;
            }
        }
        return result;
    }
}
