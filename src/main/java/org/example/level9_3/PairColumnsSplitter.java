package org.example.level9_3;

public class PairColumnsSplitter {
    public int[][] split(int[][] pairs) {
        int[] first = new int[pairs.length];
        int[] second = new int[pairs.length];

        for (int i = 0; i < pairs.length; i++) {
            first[i] = pairs[i][0];
            second[i] = pairs[i][1];
        }

        for (int i = 0; i < first.length; i++) {
            System.out.println(first[i]);
        }
        for (int i = 0; i < second.length; i++) {
            System.out.println(second[i]);
        }
        return new int[][]{first, second};
    }
}
