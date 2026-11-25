package org.example.level5_3;

public class TenNumbersSum {

    /** Returns the sum of exactly ten numbers. */
    public long sum(int... numbers) {
        if (numbers.length != 10) {
            throw new IllegalArgumentException("Exactly 10 numbers are required, got " + numbers.length);
        }
        long result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
