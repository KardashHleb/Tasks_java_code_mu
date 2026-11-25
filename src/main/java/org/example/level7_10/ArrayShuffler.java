package org.example.level7_10;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffler {

    /** Returns a shuffled copy of the array. */
    public int[] shuffle(int[] values) {
        return shuffle(values, new Random());
    }

    /**
     * Returns a shuffled copy of the array using the Fisher-Yates algorithm: walking from the end, each
     * element is swapped with a random element at or before it, which makes every permutation equally likely.
     */
    public int[] shuffle(int[] values, Random random) {
        int[] result = Arrays.copyOf(values, values.length);
        for (int i = result.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = result[i];
            result[i] = result[index];
            result[index] = temp;
        }
        return result;
    }
}
