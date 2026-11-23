package org.example.level7_5;

public class MinMaxRangeFiller {
    public int[] fill(int first, int second) {
        int min = first;
        int max = second;
        if (second < first) {
            min = second;
            max = first;
        }

        int[] result = new int[max - min + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = min + i;
            System.out.println(result[i]);
        }

        return result;
    }
}
