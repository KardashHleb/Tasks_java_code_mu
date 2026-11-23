package org.example.level2_5;

public class PositiveElementsSum {
    public int sumPositive(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println(sum);
        return sum;
    }
}
