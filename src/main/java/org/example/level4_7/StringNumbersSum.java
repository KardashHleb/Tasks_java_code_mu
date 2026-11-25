package org.example.level4_7;

public class StringNumbersSum {

    /** Sums an array of integers written as strings. */
    public int sum(String[] arr) {
        int sum = 0;
        for (String str : arr) {
            try {
                sum += Integer.parseInt(str.trim());
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Not an integer: \"" + str + "\"", e);
            }
        }
        return sum;
    }
}
