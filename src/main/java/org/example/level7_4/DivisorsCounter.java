package org.example.level7_4;

public class DivisorsCounter {

    /** Returns how many positive divisors the number has (the sign is ignored). */
    public int count(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Zero has infinitely many divisors");
        }
        int positive = Math.abs(number);
        int result = 0;
        for (int divisor = 1; divisor <= positive; divisor++) {
            if (positive % divisor == 0) {
                result++;
            }
        }
        return result;
    }
}
