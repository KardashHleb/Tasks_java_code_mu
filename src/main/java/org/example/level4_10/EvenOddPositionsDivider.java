package org.example.level4_10;

public class EvenOddPositionsDivider {
    public double divide(int[] arr) {
        int evenPositionsSum = 0;
        int oddPositionsSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                evenPositionsSum = evenPositionsSum + arr[i];
            } else {
                oddPositionsSum = oddPositionsSum + arr[i];
            }
        }

        double result = (double) evenPositionsSum / oddPositionsSum;
        System.out.println(result);
        return result;
    }
}
