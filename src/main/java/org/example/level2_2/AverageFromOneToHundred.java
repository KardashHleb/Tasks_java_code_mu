package org.example.level2_2;

public class AverageFromOneToHundred {
    public double calculateAverage() {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        double average = (double) sum / 100;
        System.out.println(average);
        return average;
    }
}
