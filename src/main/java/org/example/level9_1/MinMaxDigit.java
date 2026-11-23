package org.example.level9_1;

public class MinMaxDigit {
    public int[] find(int number) {
        int value = number;
        if (value < 0) {
            value = -value;
        }

        int min = value % 10;
        int max = value % 10;
        if (value == 0) {
            min = 0;
            max = 0;
        }

        while (value > 0) {
            int digit = value % 10;
            if (digit < min) {
                min = digit;
            }
            if (digit > max) {
                max = digit;
            }
            value = value / 10;
        }

        System.out.println(min);
        System.out.println(max);
        return new int[]{min, max};
    }
}
