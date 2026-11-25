package org.example.level4_6;

import java.util.Arrays;

public class NumbersWithZeroFilter {

    /** Returns the numbers whose decimal notation contains the digit 0. */
    public int[] filter(int[] arr) {
        return Arrays.stream(arr)
                .filter(this::containsZero)
                .toArray();
    }

    private boolean containsZero(int number) {
        int rest = Math.abs(number);
        do {
            if (rest % 10 == 0) {
                return true;
            }
            rest = rest / 10;
        } while (rest > 0);
        return false;
    }
}
