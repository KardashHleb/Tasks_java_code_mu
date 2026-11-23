package org.example.level9_4;

public class ClosestToAverage {
    public int find(int[] values) {
        if (values.length == 0) {
            System.out.println("массив пуст");
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        double average = sum / values.length;

        int result = values[0];
        double best = values[0] - average;
        if (best < 0) {
            best = -best;
        }

        for (int i = 1; i < values.length; i++) {
            double distance = values[i] - average;
            if (distance < 0) {
                distance = -distance;
            }
            if (distance < best) {
                best = distance;
                result = values[i];
            }
        }

        System.out.println(result);
        return result;
    }
}
