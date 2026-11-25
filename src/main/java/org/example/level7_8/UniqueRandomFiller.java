package org.example.level7_8;

import java.util.Random;

public class UniqueRandomFiller {

    /** Fills an array with {@code count} distinct random numbers from {@code min} to {@code max} inclusive. */
    public int[] fill(int count, int min, int max) {
        return fill(count, min, max, new Random());
    }

    /** Same as {@link #fill(int, int, int)} with a caller-supplied random generator. */
    public int[] fill(int count, int min, int max, Random random) {
        if (min > max) {
            throw new IllegalArgumentException("Min must not be greater than max: " + min + " > " + max);
        }
        long span = (long) max - min + 1;
        if (count < 0 || count > span) {
            throw new IllegalArgumentException("Count must be between 0 and " + span + ": " + count);
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            int value;
            do {
                value = (int) random.nextLong(min, (long) max + 1);
            } while (contains(result, i, value));
            result[i] = value;
        }
        return result;
    }

    private boolean contains(int[] values, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (values[i] == value) {
                return true;
            }
        }
        return false;
    }
}
