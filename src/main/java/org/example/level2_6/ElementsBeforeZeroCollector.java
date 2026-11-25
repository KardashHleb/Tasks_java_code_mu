package org.example.level2_6;

import java.util.Arrays;

public class ElementsBeforeZeroCollector {

    /** Returns the elements that precede the first zero (the whole array if there is no zero). */
    public int[] elementsBeforeZero(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int end = 0;
        while (end < arr.length && arr[end] != 0) {
            end++;
        }
        return Arrays.copyOf(arr, end);
    }
}
