package org.example.level10_3;

import java.util.ArrayList;
import java.util.List;

public class AmicableRange {

    /** All pairs of amicable numbers {a, b} with from <= a < b <= to, e.g. {220, 284}. */
    public List<int[]> pairs(int from, int to) {
        if (from < 1 || from > to) {
            throw new IllegalArgumentException("Invalid range: [" + from + ", " + to + "]");
        }
        List<int[]> result = new ArrayList<>();
        for (int number = from; number <= to; number++) {
            long pair = properDivisorSum(number);
            if (pair > number && pair <= to && properDivisorSum((int) pair) == number) {
                result.add(new int[]{number, (int) pair});
            }
        }
        return result;
    }

    /** Sum of the divisors of a number excluding the number itself; divisors come in pairs d and n / d. */
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
