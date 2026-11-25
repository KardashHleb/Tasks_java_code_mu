package org.example.level5_6;

public class QuadraticSolver {

    /**
     * Solves a*x^2 + b*x + c = 0 and returns its real roots (two, one or none).
     * A linear equation (a = 0) has a single root.
     */
    public double[] solve(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                throw new IllegalArgumentException("Both a and b are zero: this is not an equation with an unknown");
            }
            return new double[]{-c / b};
        }
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return new double[0];
        }
        if (discriminant == 0) {
            return new double[]{-b / (2 * a)};
        }
        double sqrt = Math.sqrt(discriminant);
        return new double[]{(-b + sqrt) / (2 * a), (-b - sqrt) / (2 * a)};
    }
}
