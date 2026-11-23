package org.example.level5_10;

public class InnerThreesToZeros {
    public int[] replace(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int positive = Math.abs(arr[i]);
            int length = 1;
            int copy = positive;

            while (copy >= 10) {
                length = length + 1;
                copy = copy / 10;
            }

            int[] digits = new int[length];
            int temp = positive;
            for (int j = length - 1; j >= 0; j--) {
                digits[j] = temp % 10;
                temp = temp / 10;
            }

            for (int j = 1; j < digits.length; j++) {
                if (digits[j] == 3) {
                    digits[j] = 0;
                }
            }

            int number = 0;
            for (int j = 0; j < digits.length; j++) {
                number = number * 10 + digits[j];
            }

            result[i] = number;
            System.out.println(result[i]);
        }

        return result;
    }
}
