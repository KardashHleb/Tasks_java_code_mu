package org.example.level1_10;

public class DivideUntilLessThanTen {

    /** Counts how many times the number must be halved until it becomes less than ten. */
    public int countHalvings(double number) {
        if (Double.isNaN(number) || Double.isInfinite(number)) {
            throw new IllegalArgumentException("Number must be finite: " + number);
        }
        int iterations = 0;
        while (number >= 10) {
            number = number / 2;
            iterations++;
        }
        return iterations;
    }
}
