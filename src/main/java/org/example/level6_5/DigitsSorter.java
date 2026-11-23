package org.example.level6_5;

public class DigitsSorter {
    public int sort(int num) {
        int positive = Math.abs(num);
        int length = 1;
        int copy = positive;

        while (copy >= 10) {
            length = length + 1;
            copy = copy / 10;
        }

        int[] digits = new int[length];
        int temp = positive;
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length - 1; j++) {
                if (digits[j] > digits[j + 1]) {
                    int swap = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = swap;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < digits.length; i++) {
            result = result * 10 + digits[i];
        }

        System.out.println(result);
        return result;
    }
}
