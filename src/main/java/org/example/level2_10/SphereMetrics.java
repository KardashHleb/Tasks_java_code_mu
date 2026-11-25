package org.example.level2_10;

public class SphereMetrics {

    /** Returns the volume of a sphere: 4/3 * pi * r^3. */
    public double volume(double radius) {
        requireNonNegative(radius);
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }

    /** Returns the surface area of a sphere: 4 * pi * r^2. */
    public double surfaceArea(double radius) {
        requireNonNegative(radius);
        return 4 * Math.PI * radius * radius;
    }

    private static void requireNonNegative(double radius) {
        if (radius < 0 || Double.isNaN(radius)) {
            throw new IllegalArgumentException("Radius must not be negative: " + radius);
        }
    }
}
