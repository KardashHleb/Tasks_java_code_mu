package org.example.level7_1;

public class DivisorsSum {
    public int sum(int num) {
        int positive = Math.abs(num);
        int result = 0;

        for (int divisor = 1; divisor <= positive; divisor++) {
            if (positive % divisor == 0) {
                result = result + divisor;
            }
        }

        System.out.println(result);
        return result;
    }
}
