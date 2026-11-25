package org.example.level2_9;

public class FirstAndSecondSwapper {

    /** Returns a copy of the array with the first and the second elements swapped. */
    public int[] swap(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        int[] result = arr.clone();
        int temp = result[0];
        result[0] = result[1];
        result[1] = temp;
        return result;
    }
}
