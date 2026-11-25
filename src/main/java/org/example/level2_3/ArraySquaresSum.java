package org.example.level2_3;

public class ArraySquaresSum {

    /** Returns the sum of the squares of the array elements. */
    public long sumSquares(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        long sum = 0;
        for (int element : arr) {
            sum += (long) element * element;
        }
        return sum;
    }
}
