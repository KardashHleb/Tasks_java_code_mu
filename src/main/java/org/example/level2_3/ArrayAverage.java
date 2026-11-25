package org.example.level2_3;

public class ArrayAverage {

    /** Returns the arithmetic mean of the array elements. */
    public double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        long sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return (double) sum / arr.length;
    }
}
