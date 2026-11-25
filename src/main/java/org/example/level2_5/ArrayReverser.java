package org.example.level2_5;

public class ArrayReverser {

    /** Returns a new array with the elements in reverse order. */
    public int[] reverse(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
}
