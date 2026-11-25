package org.example.level9_4;

public class ClosestToAverage {

    /** Returns the element closest to the arithmetic mean of the array (the first one on a tie). */
    public int find(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        double average = sum / values.length;

        int result = values[0];
        double best = Math.abs(values[0] - average);
        for (int value : values) {
            double distance = Math.abs(value - average);
            if (distance < best) {
                best = distance;
                result = value;
            }
        }
        return result;
    }
}
