package org.example.level7_4;

public class DivisorsCounter {
    public int count(int num) {
        int positive = Math.abs(num);
        int result = 0;

        for (int divisor = 1; divisor <= positive; divisor++) {
            if (positive % divisor == 0) {
                result = result + 1;
            }
        }

        System.out.println(result);
        return result;
    }
}
