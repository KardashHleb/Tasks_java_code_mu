package org.example.level3_3;

import java.util.Arrays;

public class LastTwoElements {

    /** Returns a new array with the last two elements of the given array. */
    public int[] takeLastTwo(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements, got " + arr.length);
        }
        return Arrays.copyOfRange(arr, arr.length - 2, arr.length);
    }
}
