package org.example.level3_9;

public class HalvesSumDivider {

    /**
     * Divides the sum of the first half of the array by the sum of the second half.
     * For an odd length the middle element belongs to the second half.
     */
    public double divideHalves(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements, got " + arr.length);
        }
        int half = arr.length / 2;
        long firstSum = 0;
        long secondSum = 0;
        for (int i = 0; i < half; i++) {
            firstSum += arr[i];
        }
        for (int i = half; i < arr.length; i++) {
            secondSum += arr[i];
        }
        if (secondSum == 0) {
            throw new IllegalArgumentException("Sum of the second half is zero, cannot divide");
        }
        return (double) firstSum / secondSum;
    }
}
