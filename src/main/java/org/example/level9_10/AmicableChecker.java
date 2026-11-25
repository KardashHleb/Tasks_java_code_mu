package org.example.level9_10;

public class AmicableChecker {

    /** Checks whether two different positive numbers are amicable (each equals the sum of the other's proper divisors). */
    public boolean areAmicable(int first, int second) {
        if (first < 1 || second < 1) {
            throw new IllegalArgumentException("Numbers must be positive: " + first + ", " + second);
        }
        return first != second && properDivisorSum(first) == second && properDivisorSum(second) == first;
    }

    private static long properDivisorSum(int number) {
        if (number == 1) {
            return 0;
        }
        long sum = 1;
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
                int pair = number / divisor;
                if (pair != divisor) {
                    sum += pair;
                }
            }
        }
        return sum;
    }
}
