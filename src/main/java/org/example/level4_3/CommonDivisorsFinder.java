package org.example.level4_3;

import java.util.ArrayList;
import java.util.List;

public class CommonDivisorsFinder {

    /** Returns all positive common divisors of two numbers in ascending order (signs are ignored). */
    public List<Integer> find(int num1, int num2) {
        if (num1 == 0 && num2 == 0) {
            throw new IllegalArgumentException("Both numbers are zero: every number is a common divisor");
        }
        int a = Math.abs(num1);
        int b = Math.abs(num2);
        int limit = a == 0 ? b : b == 0 ? a : Math.min(a, b);
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
