package org.example.level9_7;

import java.util.ArrayList;
import java.util.List;

public class FactorPairs {

    /** All pairs {a, b} with a * b == number and a <= b, ordered by a; e.g. 12 -> {1,12}, {2,6}, {3,4}. */
    public List<int[]> pairs(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number must be positive: " + number);
        }
        List<int[]> result = new ArrayList<>();
        for (int factor = 1; factor <= number / factor; factor++) {
            if (number % factor == 0) {
                result.add(new int[]{factor, number / factor});
            }
        }
        return result;
    }
}
