package org.example.level10_2;

import java.util.ArrayList;
import java.util.List;

public class RangePrimes {

    /** Prime numbers in the range [from, to], each checked by trial division. */
    public List<Integer> primes(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("Range start " + from + " is greater than its end " + to);
        }
        List<Integer> result = new ArrayList<>();
        for (int number = Math.max(from, 2); number <= to && number > 0; number++) {
            if (isPrime(number)) {
                result.add(number);
            }
        }
        return result;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
