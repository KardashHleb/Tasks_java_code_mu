package org.example.level2_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonDivisorsFinder {

    /** Returns all common positive divisors of two positive numbers in ascending order. */
    public List<Integer> findCommonDivisors(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0) {
            throw new IllegalArgumentException("Numbers must be positive: " + num1 + ", " + num2);
        }
        int gcd = gcd(num1, num2);
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        for (int i = 1; (long) i * i <= gcd; i++) {
            if (gcd % i == 0) {
                small.add(i);
                if (i != gcd / i) {
                    large.add(gcd / i);
                }
            }
        }
        Collections.reverse(large);
        small.addAll(large);
        return small;
    }

    /** Euclid's algorithm: every common divisor of a and b divides gcd(a, b). */
    private static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
