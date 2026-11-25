package org.example.level1_3;

public class DivisionRemainder {

    /** Returns the remainder of dividing the first number by the second one. */
    public int findRemainder(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor must not be zero");
        }
        return dividend % divisor;
    }
}
