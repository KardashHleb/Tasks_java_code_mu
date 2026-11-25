package org.example.level7_3;

public class PrimeChecker {

    /** Returns true if the number is prime, checking divisors up to its square root. */
    public boolean isPrime(int number) {
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
