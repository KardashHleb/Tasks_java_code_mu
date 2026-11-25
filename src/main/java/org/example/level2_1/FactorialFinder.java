package org.example.level2_1;

public class FactorialFinder {

    /** Returns n! for n from 0 to 20 (the largest factorial that fits into a long). */
    public long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20: " + n);
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
