package org.example.level10_8;

import java.util.ArrayList;
import java.util.List;

public class Eratosthenes {

    /** Prime numbers in the range [from, to] found with the sieve of Eratosthenes. */
    public List<Integer> primes(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("Range start " + from + " is greater than its end " + to);
        }
        if (to == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Range end is too large: " + to);
        }
        List<Integer> result = new ArrayList<>();
        if (to < 2) {
            return result;
        }

        // Every prime i crosses out its multiples starting from i * i (smaller ones were crossed out earlier).
        boolean[] composite = new boolean[to + 1];
        for (int i = 2; i <= to / i; i++) {
            if (!composite[i]) {
                for (long j = (long) i * i; j <= to; j += i) {
                    composite[(int) j] = true;
                }
            }
        }

        for (int i = Math.max(from, 2); i <= to; i++) {
            if (!composite[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
