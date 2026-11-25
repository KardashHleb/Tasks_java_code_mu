package org.example.level2_2;

public class ArrayElementsSum {

    /** Returns the sum of the array elements. */
    public long sumElements(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        long sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }
}
