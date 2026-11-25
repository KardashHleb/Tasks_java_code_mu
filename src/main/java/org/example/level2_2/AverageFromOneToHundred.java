package org.example.level2_2;

public class AverageFromOneToHundred {

    /** Returns the arithmetic mean of the numbers from 1 to 100. */
    public double calculateAverage() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum / 100.0;
    }
}
