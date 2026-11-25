package org.example.level6_7;

public class TenNumbersAverage {

    /** Returns the arithmetic mean of exactly ten numbers. */
    public double average(int... numbers) {
        if (numbers.length != 10) {
            throw new IllegalArgumentException("Exactly 10 numbers are required, got " + numbers.length);
        }
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
