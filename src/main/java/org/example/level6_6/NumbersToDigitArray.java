package org.example.level6_6;

public class NumbersToDigitArray {

    /** Splits every number into its digits and puts all digits into one byte array: [12, 3] becomes [1, 2, 3]. */
    public byte[] split(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += digitCount(number);
        }

        byte[] result = new byte[total];
        int start = 0;
        for (int number : numbers) {
            int length = digitCount(number);
            long value = Math.abs((long) number);
            for (int i = start + length - 1; i >= start; i--) {
                result[i] = (byte) (value % 10);
                value /= 10;
            }
            start += length;
        }
        return result;
    }

    private int digitCount(int number) {
        long value = Math.abs((long) number);
        int count = 1;
        while (value >= 10) {
            value /= 10;
            count++;
        }
        return count;
    }
}
