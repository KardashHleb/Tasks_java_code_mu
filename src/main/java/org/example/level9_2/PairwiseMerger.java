package org.example.level9_2;

public class PairwiseMerger {
    public int[][] merge(int[] first, int[] second) {
        int length = first.length;
        if (second.length < length) {
            length = second.length;
        }
        int[][] result = new int[length][2];

        for (int i = 0; i < length; i++) {
            result[i][0] = first[i];
            result[i][1] = second[i];
            System.out.println(result[i][0] + " " + result[i][1]);
        }

        return result;
    }
}
