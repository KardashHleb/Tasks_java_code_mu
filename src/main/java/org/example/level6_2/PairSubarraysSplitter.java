package org.example.level6_2;

public class PairSubarraysSplitter {

    /** Splits the array into subarrays of two elements: [1, 2, 3, 4] becomes [[1, 2], [3, 4]]. */
    public int[][] split(int[] numbers) {
        if (numbers.length % 2 != 0) {
            throw new IllegalArgumentException("The array must have an even length, got " + numbers.length);
        }
        int[][] result = new int[numbers.length / 2][];
        for (int i = 0; i < numbers.length; i += 2) {
            result[i / 2] = new int[]{numbers[i], numbers[i + 1]};
        }
        return result;
    }
}
