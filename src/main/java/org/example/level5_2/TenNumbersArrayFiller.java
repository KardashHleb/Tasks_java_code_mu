package org.example.level5_2;

public class TenNumbersArrayFiller {

    /** Fills a new array with exactly ten given numbers. */
    public int[] fill(int... numbers) {
        if (numbers.length != 10) {
            throw new IllegalArgumentException("Exactly 10 numbers are required, got " + numbers.length);
        }
        int[] result = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i];
        }
        return result;
    }
}
