package org.example.level6_3;

public class PairsSwapper {

    /** Swaps neighbouring elements pairwise: [1, 2, 3, 4, 5] becomes [2, 1, 4, 3, 5]. */
    public int[] swap(int[] numbers) {
        int[] result = numbers.clone();
        for (int i = 0; i + 1 < result.length; i += 2) {
            int temp = result[i];
            result[i] = result[i + 1];
            result[i + 1] = temp;
        }
        return result;
    }
}
