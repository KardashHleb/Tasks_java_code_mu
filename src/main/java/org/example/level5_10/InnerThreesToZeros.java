package org.example.level5_10;

public class InnerThreesToZeros {

    /** Replaces every digit 3 with 0 in each number, except when 3 is the first digit. */
    public int[] replace(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = replaceInnerThrees(numbers[i]);
        }
        return result;
    }

    private int replaceInnerThrees(int number) {
        long value = Math.abs((long) number);
        long result = 0;
        long place = 1;
        while (value >= 10) {
            long digit = value % 10;
            if (digit != 3) {
                result += digit * place;
            }
            place *= 10;
            value /= 10;
        }
        result += value * place;
        return (int) (number < 0 ? -result : result);
    }
}
