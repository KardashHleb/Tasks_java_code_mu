package org.example.level7_8;

import java.util.Random;

public class NoAdjacentRandomFiller {

    /** Fills an array with random numbers from {@code min} to {@code max} so that no two neighbours are equal. */
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
        if (min == max && count > 1) {
            throw new IllegalArgumentException("A range of one value cannot avoid equal neighbours");
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            int value = random.nextInt(min, max + 1);
            while (i > 0 && value == result[i - 1]) {
                value = random.nextInt(min, max + 1);
            }
            result[i] = value;
        }
        return result;
    }
}
