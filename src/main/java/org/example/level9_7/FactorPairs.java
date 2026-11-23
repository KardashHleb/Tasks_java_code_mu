package org.example.level9_7;

public class FactorPairs {
    public int[][] pairs(int number) {
        System.out.println("Введите число");
        System.out.println(number);

        int value = number;
        if (value < 0) {
            value = -value;
        }
        if (value == 0) {
            return new int[0][2];
        }

        int count = 0;
        for (int factor = 1; factor <= value; factor++) {
            if (value % factor == 0) {
                count = count + 1;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int factor = 1; factor <= value; factor++) {
            if (value % factor == 0) {
                result[index][0] = factor;
                result[index][1] = value / factor;
                System.out.println(result[index][0] + " " + result[index][1]);
                index = index + 1;
            }
        }
        return result;
    }
}
