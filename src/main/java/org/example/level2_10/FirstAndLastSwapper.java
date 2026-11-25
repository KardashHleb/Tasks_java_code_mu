package org.example.level2_10;

public class FirstAndLastSwapper {

    /** Returns a copy of the array with the first and the last elements swapped. */
    public int[] swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int[] result = arr.clone();
        int last = result.length - 1;
        int temp = result[0];
        result[0] = result[last];
        result[last] = temp;
        return result;
    }
}
