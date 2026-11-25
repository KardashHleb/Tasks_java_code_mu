package org.example.level3_2;

import java.util.Arrays;

public class MiddleThreeElements {

    /**
     * Returns the three elements in the middle of the array. For an even length the window is shifted
     * to the right, e.g. {1, 2, 3, 4, 5, 6} gives {3, 4, 5}.
     */
    public int[] takeMiddleThree(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array must contain at least 3 elements, got " + arr.length);
        }
        int start = arr.length / 2 - 1;
        return Arrays.copyOfRange(arr, start, start + 3);
    }
}
