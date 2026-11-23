package org.example.level2_6;

public class PositiveLessThanTenSum {
    public int sumInRange(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < 10) {
                sum = sum + arr[i];
            }
        }

        System.out.println(sum);
        return sum;
    }
}
