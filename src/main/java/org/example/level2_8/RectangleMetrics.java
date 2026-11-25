package org.example.level2_8;

public class RectangleMetrics {

    /** Returns the area of a rectangle with sides a and b. */
    public long area(int a, int b) {
        requireNonNegative(a, b);
        return (long) a * b;
    }

    /** Returns the perimeter of a rectangle with sides a and b. */
    public long perimeter(int a, int b) {
        requireNonNegative(a, b);
        return 2L * ((long) a + b);
    }

    private static void requireNonNegative(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Sides must not be negative: " + a + ", " + b);
        }
    }
}
