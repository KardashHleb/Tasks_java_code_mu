package org.example.level2_4;

public class ArrayElementsDoubler {

    /** Returns a new array with every element multiplied by two. */
    public int[] doubleElements(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 2;
        }
        return result;
    }
}
