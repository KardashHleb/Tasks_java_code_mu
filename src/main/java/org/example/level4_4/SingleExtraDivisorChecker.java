package org.example.level4_4;

public class SingleExtraDivisorChecker {

    /**
     * Checks whether the number has exactly one divisor besides 1 and itself,
     * i.e. exactly three positive divisors (which happens only for squares of primes).
     */
    public boolean hasSingleExtraDivisor(int number) {
        int value = Math.abs(number);
        int divisors = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                divisors++;
                if (divisors > 3) {
                    return false;
                }
            }
        }
        return divisors == 3;
    }
}
