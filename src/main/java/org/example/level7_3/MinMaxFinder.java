package org.example.level7_3;

public class MinMaxFinder {

    /** Smallest and largest element of an array. */
    public record MinMax(int min, int max) {
    }

    /** Finds the smallest and the largest element in a single pass. */
    public MinMax find(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = values[0];
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
            if (values[i] < min) {
                min = values[i];
            }
        }
        return new MinMax(min, max);
    }
}
