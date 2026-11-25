package org.example.level10_1;

import java.util.ArrayList;
import java.util.List;

public class SchoolLcm {

    /** The least common multiple and the school-style column of divisions that produced it. */
    public record Solution(long lcm, List<String> steps) {
    }

    /** Least common multiple of two positive numbers. */
    public long lcm(int first, int second) {
        return solve(first, second).lcm();
    }

    /**
     * Finds the LCM the way it is done at school: both numbers are written side by side and divided
     * by the smallest prime that divides at least one of them, until both become 1. The LCM is the
     * product of all divisors on the right. For 12 and 18 the steps are
     * "12 18 | 2", "6 9 | 2", "3 9 | 3", "1 3 | 3", "1 1 |", "LCM = 36".
     */
    public Solution solve(int first, int second) {
        if (first < 1 || second < 1) {
            throw new IllegalArgumentException("Numbers must be positive: " + first + ", " + second);
        }
        List<String> steps = new ArrayList<>();
        int left = first;
        int right = second;
        long result = 1;
        while (left > 1 || right > 1) {
            int divisor = Math.min(smallestPrimeFactor(left), smallestPrimeFactor(right));
            steps.add(left + " " + right + " | " + divisor);
            if (left % divisor == 0) {
                left /= divisor;
            }
            if (right % divisor == 0) {
                right /= divisor;
            }
            result *= divisor;
        }
        steps.add(left + " " + right + " |");
        steps.add("LCM = " + result);
        return new Solution(result, List.copyOf(steps));
    }

    /** Smallest prime factor of a number, or Integer.MAX_VALUE for 1 (which has none). */
    private static int smallestPrimeFactor(int number) {
        if (number == 1) {
            return Integer.MAX_VALUE;
        }
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return divisor;
            }
        }
        return number;
    }
}
