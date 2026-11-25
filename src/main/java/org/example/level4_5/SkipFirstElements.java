package org.example.level4_5;

import java.util.Arrays;

public class SkipFirstElements {

    /** Returns the array without its first {@code count} elements. */
    public int[] skip(int[] arr, int count) {
        if (count < 0 || count > arr.length) {
            throw new IllegalArgumentException("Count must be between 0 and " + arr.length + ", got " + count);
        }
        return Arrays.copyOfRange(arr, count, arr.length);
    }
}
