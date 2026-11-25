package org.example.level5_4;

public class FirstDigitsCollector {

    /** Collects the first digit of every number into a byte array. */
    public byte[] collect(int[] numbers) {
        byte[] result = new byte[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            long first = Math.abs((long) numbers[i]);
            while (first >= 10) {
                first /= 10;
            }
            result[i] = (byte) first;
        }
        return result;
    }
}
