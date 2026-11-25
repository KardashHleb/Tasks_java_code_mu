package org.example.level8_9;

public class DoubledDigitsArray {

    /** Returns {12, 34, 56, 78, 90}: numbers made of consecutive digit pairs, where 10 wraps to 0. */
    public int[] make() {
        int[] result = new int[5];
        for (int i = 0; i < result.length; i++) {
            int first = i * 2 + 1;
            int second = (i * 2 + 2) % 10;
            result[i] = first * 10 + second;
        }
        return result;
    }
}
