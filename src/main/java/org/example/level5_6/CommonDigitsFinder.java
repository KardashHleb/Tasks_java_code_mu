package org.example.level5_6;

public class CommonDigitsFinder {

    /** Returns the distinct digits present in both numbers, in the order they appear in the first one. */
    public String find(int first, int second) {
        boolean[] inSecond = digitSet(second);
        boolean[] added = new boolean[10];
        StringBuilder result = new StringBuilder();
        for (char digit : Long.toString(Math.abs((long) first)).toCharArray()) {
            int value = digit - '0';
            if (inSecond[value] && !added[value]) {
                added[value] = true;
                result.append(digit);
            }
        }
        return result.toString();
    }

    private boolean[] digitSet(int number) {
        boolean[] digits = new boolean[10];
        long value = Math.abs((long) number);
        do {
            digits[(int) (value % 10)] = true;
            value /= 10;
        } while (value > 0);
        return digits;
    }
}
