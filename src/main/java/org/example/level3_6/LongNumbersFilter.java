package org.example.level3_6;

import java.util.Arrays;

public class LongNumbersFilter {

    /** Returns the numbers that have at least four digits (sign ignored). */
    public int[] filter(int[] arr) {
        return Arrays.stream(arr)
                .filter(number -> Math.abs(number) >= 1000)
                .toArray();
    }
}
