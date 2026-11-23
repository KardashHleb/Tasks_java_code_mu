package org.example.level3_9;

public class HalvesSumDivider {
    public double divideHalves(int[] arr) {
        int half = arr.length / 2;
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < half; i++) {
            firstSum = firstSum + arr[i];
        }

        for (int i = half; i < arr.length; i++) {
            secondSum = secondSum + arr[i];
        }

        double result = (double) firstSum / secondSum;
        System.out.println(result);
        return result;
    }
}
