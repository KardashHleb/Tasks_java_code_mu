package org.example.level3_1;

import java.util.Arrays;

public class FirstThreeElements {

    /** Returns a new array with the first three elements of the given array. */
    public int[] takeFirstThree(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array must contain at least 3 elements, got " + arr.length);
        }
        return Arrays.copyOf(arr, 3);
    }
}
