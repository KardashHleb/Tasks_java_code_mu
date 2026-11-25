package org.example.level10_2;

import java.util.ArrayList;
import java.util.List;

public class SchoolGcd {

    /** The greatest common divisor and the steps of Euclid's algorithm. */
    public record Solution(long gcd, List<String> steps) {
    }

    /** Greatest common divisor of two numbers (signs are ignored). */
    public long gcd(int first, int second) {
        return solve(first, second).gcd();
    }

    /**
     * Euclid's algorithm written out step by step: a = b * q + r, then (a, b) becomes (b, r)
     * until the remainder is zero. For 48 and 18:
     * "48 = 18 * 2 + 12", "18 = 12 * 1 + 6", "12 = 6 * 2 + 0", "GCD = 6".
     */
    public Solution solve(int first, int second) {
        if (first == 0 && second == 0) {
            throw new IllegalArgumentException("GCD of 0 and 0 is undefined");
        }
        long left = Math.abs((long) first);
        long right = Math.abs((long) second);
        List<String> steps = new ArrayList<>();
        while (right != 0) {
            long quotient = left / right;
            long rest = left % right;
            steps.add(left + " = " + right + " * " + quotient + " + " + rest);
            left = right;
            right = rest;
        }
        steps.add("GCD = " + left);
        return new Solution(left, List.copyOf(steps));
    }
}
