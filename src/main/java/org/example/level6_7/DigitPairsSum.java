package org.example.level6_7;

public class DigitPairsSum {

    /** Splits a number with an even count of digits into two-digit pairs and sums them: 123456 gives 12 + 34 + 56. */
    public int sum(int number) {
        int value = Math.abs(number);
        if (number == Integer.MIN_VALUE || digitCount(value) % 2 != 0) {
            throw new IllegalArgumentException("The number must have an even count of digits: " + number);
        }
        int result = 0;
        while (value > 0) {
            result += value % 100;
            value /= 100;
        }
        return result;
    }

    private int digitCount(int value) {
        int count = 1;
        while (value >= 10) {
            value /= 10;
            count++;
        }
        return count;
    }
}
