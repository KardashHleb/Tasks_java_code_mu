package org.example.level6_6;

public class NumbersToDigitArray {
    public byte[] split(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = Math.abs(arr[i]);
            if (temp == 0) {
                count = count + 1;
            }
            while (temp > 0) {
                count = count + 1;
                temp = temp / 10;
            }
        }

        byte[] result = new byte[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int positive = Math.abs(arr[i]);
            int length = 1;
            int copy = positive;
            while (copy >= 10) {
                length = length + 1;
                copy = copy / 10;
            }

            int divisor = 1;
            for (int j = 1; j < length; j++) {
                divisor = divisor * 10;
            }

            int temp = positive;
            for (int j = 0; j < length; j++) {
                int digit = temp / divisor;
                temp = temp % divisor;
                if (divisor > 1) {
                    divisor = divisor / 10;
                }
                result[index] = (byte) digit;
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }
}
