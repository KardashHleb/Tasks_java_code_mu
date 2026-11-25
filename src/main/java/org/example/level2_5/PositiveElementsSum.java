package org.example.level2_5;

public class PositiveElementsSum {

    /** Returns the sum of the positive array elements. */
    public long sumPositive(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        long sum = 0;
        for (int element : arr) {
            if (element > 0) {
                sum += element;
            }
        }
        return sum;
    }
}
