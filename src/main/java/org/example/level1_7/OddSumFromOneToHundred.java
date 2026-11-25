package org.example.level1_7;

public class OddSumFromOneToHundred {

    /** Returns the sum of the odd numbers from 1 to 100. */
    public int calculateOddSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }
}
