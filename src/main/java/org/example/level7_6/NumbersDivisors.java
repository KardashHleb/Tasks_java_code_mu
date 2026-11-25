package org.example.level7_6;

import java.util.Arrays;

public class NumbersDivisors {

    /** Replaces every number of the array with the array of its positive divisors. */
    public int[][] divisorsOf(int[] numbers) {
        int[][] result = new int[numbers.length][];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = divisors(numbers[i]);
        }
        return result;
    }

    private int[] divisors(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Zero has infinitely many divisors");
        }
        int positive = Math.abs(number);
        // a number n has at most 2 * sqrt(n) divisors
        int[] found = new int[2 * (int) Math.sqrt(positive) + 1];
        int size = 0;
        for (int divisor = 1; divisor <= positive; divisor++) {
            if (positive % divisor == 0) {
                found[size++] = divisor;
            }
        }
        return Arrays.copyOf(found, size);
    }
}
