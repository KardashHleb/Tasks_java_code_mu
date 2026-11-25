package org.example.level6_4;

public class Factorial {

    /** Returns n! for 0 <= n <= 20 (the largest factorial that fits into a long). */
    public long of(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial of a negative number is not defined: " + number);
        }
        if (number > 20) {
            throw new IllegalArgumentException("Factorial of " + number + " does not fit into a long");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
