package org.example.level4_2;

import java.util.ArrayList;
import java.util.List;

public class DivisorsFinder {

    /** Returns all positive divisors of the number in ascending order (the sign is ignored). */
    public List<Integer> findDivisors(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Zero has infinitely many divisors");
        }
        int value = Math.abs(number);
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
