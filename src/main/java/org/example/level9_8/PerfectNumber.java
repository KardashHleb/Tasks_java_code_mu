package org.example.level9_8;

public class PerfectNumber {

    /** Checks whether a number equals the sum of its proper divisors (6, 28, 496, ...). */
    public boolean isPerfect(int number) {
        if (number < 2) {
            return false;
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
        return sum == number;
    }
}
