package org.example.level6_1;

public class SquareRootFinder {

    /** Returns the square root of a non-negative number. */
    public double find(double number) {
        if (number < 0 || Double.isNaN(number)) {
            throw new IllegalArgumentException("Square root of a negative number is not defined: " + number);
        }
        return Math.sqrt(number);
    }
}
