package org.example.level5_2;

import java.util.Arrays;

public class FirstDigitOneOrTwoFilter {

    /** Keeps only the numbers whose first digit is 1 or 2. */
    public int[] filter(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(number -> {
                    int first = firstDigit(number);
                    return first == 1 || first == 2;
                })
                .toArray();
    }

    private int firstDigit(int number) {
        long value = Math.abs((long) number);
        while (value >= 10) {
            value /= 10;
        }
        return (int) value;
    }
}
