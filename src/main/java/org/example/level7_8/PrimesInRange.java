package org.example.level7_8;

import java.util.ArrayList;
import java.util.List;

public class PrimesInRange {

    /** Returns all primes between the two bounds inclusive (bounds may come in any order). */
    public List<Integer> primes(int from, int to) {
        int min = Math.min(from, to);
        int max = Math.max(from, to);
        List<Integer> result = new ArrayList<>();
        for (long number = min; number <= max; number++) {
            if (isPrime((int) number)) {
                result.add((int) number);
            }
        }
        return result;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (long divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
