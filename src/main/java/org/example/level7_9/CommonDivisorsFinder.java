package org.example.level7_9;

import java.util.ArrayList;
import java.util.List;

public class CommonDivisorsFinder {

    /** Returns all positive numbers that divide every element of the array, in ascending order. */
    public List<Integer> find(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = Integer.MAX_VALUE;
        for (int value : values) {
            if (value == 0) {
                throw new IllegalArgumentException("Zero has infinitely many divisors");
            }
            min = Math.min(min, Math.abs(value));
        }
        // a common divisor cannot exceed the smallest absolute value
        List<Integer> result = new ArrayList<>();
        for (int divisor = 1; divisor <= min; divisor++) {
            if (dividesAll(values, divisor)) {
                result.add(divisor);
            }
        }
        return result;
    }

    private boolean dividesAll(int[] values, int divisor) {
        for (int value : values) {
            if (value % divisor != 0) {
                return false;
            }
        }
        return true;
    }
}
