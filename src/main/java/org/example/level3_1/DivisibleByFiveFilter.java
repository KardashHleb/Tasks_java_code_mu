package org.example.level3_1;

import java.util.Arrays;

public class DivisibleByFiveFilter {

    /** Returns the elements of the array that are divisible by five, in their original order. */
    public int[] filter(int[] arr) {
        return Arrays.stream(arr)
                .filter(number -> number % 5 == 0)
                .toArray();
    }
}
