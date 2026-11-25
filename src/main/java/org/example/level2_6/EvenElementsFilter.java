package org.example.level2_6;

import java.util.Arrays;

public class EvenElementsFilter {

    /** Returns the even elements of the array in their original order. */
    public int[] evenElements(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int[] even = new int[arr.length];
        int count = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                even[count++] = element;
            }
        }
        return Arrays.copyOf(even, count);
    }
}
