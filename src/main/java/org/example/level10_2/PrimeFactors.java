package org.example.level10_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeFactors {

    /** Prime factors of a positive number in ascending order with repetition, e.g. 60 -> [2, 2, 3, 5]; 1 -> []. */
    public List<Integer> factor(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number must be positive: " + number);
        }
        List<Integer> result = new ArrayList<>();
        int value = number;
        for (int divisor = 2; divisor <= value / divisor; divisor++) {
            while (value % divisor == 0) {
                result.add(divisor);
                value /= divisor;
            }
        }
        if (value > 1) {
            result.add(value);
        }
        return result;
    }

    /** The factorization written as a product, e.g. 60 -> "2 * 2 * 3 * 5". */
    public String format(int number) {
        List<Integer> factors = factor(number);
        if (factors.isEmpty()) {
            return String.valueOf(number);
        }
        return factors.stream().map(String::valueOf).collect(Collectors.joining(" * "));
    }
}
