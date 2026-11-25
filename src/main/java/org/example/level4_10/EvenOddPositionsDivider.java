package org.example.level4_10;

public class EvenOddPositionsDivider {

    /**
     * Divides the sum of the elements at even positions by the sum of the elements at odd positions.
     * Positions are counted from 1, so the first element is at an odd position.
     */
    public double divide(int[] arr) {
        long evenPositionsSum = 0;
        long oddPositionsSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                evenPositionsSum += arr[i];
            } else {
                oddPositionsSum += arr[i];
            }
        }
        if (oddPositionsSum == 0) {
            throw new IllegalArgumentException("Sum of the elements at odd positions is zero, cannot divide");
        }
        return (double) evenPositionsSum / oddPositionsSum;
    }
}
