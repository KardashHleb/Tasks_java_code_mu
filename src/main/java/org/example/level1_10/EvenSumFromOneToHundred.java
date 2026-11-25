package org.example.level1_10;

public class EvenSumFromOneToHundred {

    /** Returns the sum of the even numbers from 1 to 100. */
    public int calculateEvenSum() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }
}
