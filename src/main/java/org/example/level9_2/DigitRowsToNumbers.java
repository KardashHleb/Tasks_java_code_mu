package org.example.level9_2;

public class DigitRowsToNumbers {

    /** Turns every row of digits into a number, e.g. {1, 2, 3} -> 123. */
    public long[] join(int[][] rows) {
        long[] result = new long[rows.length];
        for (int i = 0; i < rows.length; i++) {
            long number = 0;
            for (int digit : rows[i]) {
                if (digit < 0 || digit > 9) {
                    throw new IllegalArgumentException("Not a digit: " + digit);
                }
                number = Math.addExact(Math.multiplyExact(number, 10), digit);
            }
            result[i] = number;
        }
        return result;
    }
}
