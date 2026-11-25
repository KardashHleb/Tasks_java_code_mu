package org.example.level3_10;

import java.util.Arrays;

public class UniqueDigitNumbers {

    /** Returns the numbers from the array whose digits are all different. */
    public int[] collect(int[] arr) {
        return Arrays.stream(arr)
                .filter(this::hasUniqueDigits)
                .toArray();
    }

    private boolean hasUniqueDigits(int number) {
        int rest = Math.abs(number);
        boolean[] seen = new boolean[10];
        do {
            int digit = rest % 10;
            if (seen[digit]) {
                return false;
            }
            seen[digit] = true;
            rest = rest / 10;
        } while (rest > 0);
        return true;
    }
}
