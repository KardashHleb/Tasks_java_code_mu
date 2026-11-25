package org.example.level7_5;

public class FibonacciSum {

    /** Returns the sum of the first {@code count} Fibonacci numbers 1, 1, 2, 3, 5, ... */
    public long sumFirst(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Count must not be negative: " + count);
        }
        long result = 0;
        long previous = 0;
        long current = 1;
        for (int i = 0; i < count; i++) {
            result += current;
            long next = previous + current;
            previous = current;
            current = next;
        }
        return result;
    }
}
