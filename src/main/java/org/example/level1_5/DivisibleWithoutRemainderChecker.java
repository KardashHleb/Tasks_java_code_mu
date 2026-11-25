package org.example.level1_5;

public class DivisibleWithoutRemainderChecker {

    /** Checks whether the first number is divisible by the second one without a remainder. */
    public boolean isDivisible(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor must not be zero");
        }
        return dividend % divisor == 0;
    }
}
