package org.example.level6_10;

import java.util.Random;

public class RandomFromOneToHundred {

    /** Fills an array of ten random numbers from 1 to 100. */
    public int[] fill() {
        return fill(new Random());
    }

    /** Fills an array of ten random numbers from 1 to 100 using the given generator. */
    public int[] fill(Random random) {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(100) + 1;
        }
        return result;
    }
}
