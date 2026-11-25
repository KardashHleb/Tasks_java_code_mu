package org.example.level7_4;

import java.util.Random;

public class RandomRangeFiller {

    /** Fills an array of {@code count} random numbers from {@code min} to {@code max} inclusive. */
    public int[] fill(int count, int min, int max) {
        return fill(count, min, max, new Random());
    }

    /** Same as {@link #fill(int, int, int)} with a caller-supplied random generator. */
    public int[] fill(int count, int min, int max, Random random) {
        if (count < 0) {
            throw new IllegalArgumentException("Count must not be negative: " + count);
        }
        if (min > max) {
            throw new IllegalArgumentException("Min must not be greater than max: " + min + " > " + max);
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(min, max + 1);
        }
        return result;
    }
}
