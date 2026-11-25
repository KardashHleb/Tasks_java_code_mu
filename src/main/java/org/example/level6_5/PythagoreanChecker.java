package org.example.level6_5;

public class PythagoreanChecker {

    /** Checks whether three positive numbers (in any order) form a Pythagorean triple. */
    public boolean isTriple(int first, int second, int third) {
        if (first <= 0 || second <= 0 || third <= 0) {
            throw new IllegalArgumentException("All numbers must be positive");
        }
        long max = Math.max(first, Math.max(second, third));
        long squares = (long) first * first + (long) second * second + (long) third * third;
        long maxSquare = max * max;
        return maxSquare == squares - maxSquare;
    }
}
