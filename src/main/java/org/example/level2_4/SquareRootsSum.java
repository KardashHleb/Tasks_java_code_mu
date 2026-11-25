package org.example.level2_4;

public class SquareRootsSum {

    /** Returns the sum of the square roots of the (non-negative) array elements. */
    public double sumSquareRoots(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        double sum = 0;
        for (int element : arr) {
            if (element < 0) {
                throw new IllegalArgumentException("Cannot take the square root of a negative number: " + element);
            }
            sum += Math.sqrt(element);
        }
        return sum;
    }
}
