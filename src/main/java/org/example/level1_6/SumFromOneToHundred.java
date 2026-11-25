package org.example.level1_6;

public class SumFromOneToHundred {

    /** Returns the sum of the numbers from 1 to 100. */
    public int calculateSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
