package org.example.level9_1;

public class MinMaxDigit {

    /** Smallest and largest digit of a number. */
    public record MinMax(int min, int max) {
    }

    /** Finds the smallest and the largest digit of a number (the sign is ignored). */
    public MinMax find(int number) {
        long value = Math.abs((long) number);
        int min = (int) (value % 10);
        int max = min;
        while (value > 0) {
            int digit = (int) (value % 10);
            min = Math.min(min, digit);
            max = Math.max(max, digit);
            value = value / 10;
        }
        return new MinMax(min, max);
    }
}
