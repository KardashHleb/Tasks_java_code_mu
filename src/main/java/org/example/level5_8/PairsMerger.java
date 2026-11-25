package org.example.level5_8;

public class PairsMerger {

    /** Glues the numbers of each consecutive pair together: [1, 2, 3, 45] becomes [12, 345]. */
    public long[] merge(int[] numbers) {
        if (numbers.length % 2 != 0) {
            throw new IllegalArgumentException("The array must have an even length, got " + numbers.length);
        }
        long[] result = new long[numbers.length / 2];
        for (int i = 0; i < numbers.length; i += 2) {
            int first = numbers[i];
            int second = numbers[i + 1];
            if (first < 0 || second < 0) {
                throw new IllegalArgumentException("Numbers must not be negative");
            }
            long multiplier = 10;
            for (int rest = second / 10; rest > 0; rest /= 10) {
                multiplier *= 10;
            }
            result[i / 2] = Math.addExact(Math.multiplyExact(first, multiplier), second);
        }
        return result;
    }
}
