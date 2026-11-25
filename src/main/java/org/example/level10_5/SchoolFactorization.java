package org.example.level10_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SchoolFactorization {

    /** The prime factors and the school-style column that produced them. */
    public record Solution(List<Integer> factors, List<String> steps) {
    }

    /** Prime factors of a number (at least 2) in ascending order with repetition. */
    public List<Integer> factor(int number) {
        return solve(number).factors();
    }

    /**
     * Factorizes a number "in a column": the current value is divided by the smallest divisor
     * that fits, writing "value | divisor" on every line, until 1 is left. For 60 the steps are
     * "60 | 2", "30 | 2", "15 | 3", "5 | 5", "1 |", "60 = 2 * 2 * 3 * 5".
     */
    public Solution solve(int number) {
        if (number < 2) {
            throw new IllegalArgumentException("Number must be at least 2: " + number);
        }
        List<Integer> factors = new ArrayList<>();
        List<String> steps = new ArrayList<>();
        int value = number;
        int divisor = 2;
        while (value > 1) {
            if (divisor > value / divisor) {
                divisor = value; // no divisor up to the square root: the rest is prime
            }
            if (value % divisor == 0) {
                steps.add(value + " | " + divisor);
                factors.add(divisor);
                value /= divisor;
            } else {
                divisor++;
            }
        }
        steps.add("1 |");
        steps.add(number + " = " + factors.stream().map(String::valueOf).collect(Collectors.joining(" * ")));
        return new Solution(List.copyOf(factors), List.copyOf(steps));
    }
}
