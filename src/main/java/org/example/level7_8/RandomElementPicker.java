package org.example.level7_8;

import java.util.Random;

public class RandomElementPicker {

    /** Returns a random element of the array. */
    public int pick(int[] values) {
        return pick(values, new Random());
    }

    /** Same as {@link #pick(int[])} with a caller-supplied random generator. */
    public int pick(int[] values, Random random) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        return values[random.nextInt(values.length)];
    }
}
