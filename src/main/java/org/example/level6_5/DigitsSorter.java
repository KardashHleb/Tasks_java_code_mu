package org.example.level6_5;

public class DigitsSorter {

    /** Sorts the digits of the number in ascending order (counting sort); leading zeros disappear, the sign is kept. */
    public long sort(int number) {
        int[] counts = new int[10];
        long value = Math.abs((long) number);
        do {
            counts[(int) (value % 10)]++;
            value /= 10;
        } while (value > 0);

        long result = 0;
        for (int digit = 0; digit <= 9; digit++) {
            for (int i = 0; i < counts[digit]; i++) {
                result = result * 10 + digit;
            }
        }
        return number < 0 ? -result : result;
    }
}
