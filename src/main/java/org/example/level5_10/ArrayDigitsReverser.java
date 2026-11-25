package org.example.level5_10;

public class ArrayDigitsReverser {

    /** Reverses the digits of every number of the array: 123 becomes 321, -45 becomes -54. */
    public long[] reverseDigits(int[] numbers) {
        long[] result = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            long value = Math.abs((long) numbers[i]);
            long reversed = 0;
            while (value > 0) {
                reversed = reversed * 10 + value % 10;
                value /= 10;
            }
            result[i] = numbers[i] < 0 ? -reversed : reversed;
        }
        return result;
    }
}
