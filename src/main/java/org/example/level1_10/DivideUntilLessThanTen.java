package org.example.level1_10;

public class DivideUntilLessThanTen {
    public int countIterations(float num) {
        int iterations = 0;

        while (num >= 10) {
            num = num / 2;
            iterations++;
        }

        System.out.println(iterations);
        return iterations;
    }
}
