package org.example.level7_1;

public class DivisorsSum {

    /** Returns the sum of all positive divisors of the number (the sign is ignored). */
    public int sum(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Zero has infinitely many divisors");
        }
        int positive = Math.abs(number);
        int result = 0;
        for (int divisor = 1; divisor <= positive; divisor++) {
            if (positive % divisor == 0) {
                result += divisor;
            }
        }
        return result;
    }
}
