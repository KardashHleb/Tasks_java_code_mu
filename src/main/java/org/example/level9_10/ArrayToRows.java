package org.example.level9_10;

public class ArrayToRows {
    public int[][] split(int[] values, int count) {
        if (count < 1) {
            count = 1;
        }
        int rows = values.length / count;
        if (values.length % count != 0) {
            rows = rows + 1;
        }
        int[][] result = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int length = count;
            if (i * count + length > values.length) {
                length = values.length - i * count;
            }
            result[i] = new int[length];
            for (int j = 0; j < length; j++) {
                result[i][j] = values[i * count + j];
                System.out.print(result[i][j]);
                if (j < length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return result;
    }
}
