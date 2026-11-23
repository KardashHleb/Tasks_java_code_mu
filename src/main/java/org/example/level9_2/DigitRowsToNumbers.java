package org.example.level9_2;

public class DigitRowsToNumbers {
    public int[] join(int[][] rows) {
        int[] result = new int[rows.length];

        for (int i = 0; i < rows.length; i++) {
            int number = 0;
            for (int j = 0; j < rows[i].length; j++) {
                number = number * 10 + rows[i][j];
            }
            result[i] = number;
            System.out.println(result[i]);
        }

        return result;
    }
}
