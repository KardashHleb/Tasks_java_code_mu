package org.example.level1_10;

import java.util.ArrayList;
import java.util.List;

public class DivisorsFinder {

    /** Returns all positive divisors of a positive number in ascending order. */
    public List<Integer> findDivisors(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive: " + number);
        }
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
