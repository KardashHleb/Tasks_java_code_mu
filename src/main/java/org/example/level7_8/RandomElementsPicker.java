package org.example.level7_8;

import java.util.Arrays;
import java.util.Random;

public class RandomElementsPicker {

    /** Returns {@code count} elements taken from distinct random positions of the array. */
    public int[] pick(int[] values, int count) {
        return pick(values, count, new Random());
    }

    /**
     * Same as {@link #pick(int[], int)} with a caller-supplied random generator. A picked element is
     * replaced by the last element of the shrinking pool, so each pick costs O(1).
     */
    public int[] pick(int[] values, int count, Random random) {
        if (count < 0 || count > values.length) {
            throw new IllegalArgumentException("Count must be between 0 and " + values.length + ": " + count);
        }
        int[] pool = Arrays.copyOf(values, values.length);
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            int lastIndex = pool.length - 1 - i;
            int index = random.nextInt(lastIndex + 1);
            result[i] = pool[index];
            pool[index] = pool[lastIndex];
        }
        return result;
    }
}
