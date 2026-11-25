package org.example.level4_9;

import java.util.Random;

public class RandomArrayFiller {

    /** Fills an array of ten elements with random numbers from 1 to 100. */
    public int[] fill() {
        return fill(new Random());
    }

    /** Same as {@link #fill()} but uses the given random generator, so the result can be reproduced. */
    public int[] fill(Random random) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        return arr;
    }
}
