package org.example.level2_3;

public class ArrayAverage {
    public double calculateAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = (double) sum / arr.length;
        System.out.println(average);
        return average;
    }
}
