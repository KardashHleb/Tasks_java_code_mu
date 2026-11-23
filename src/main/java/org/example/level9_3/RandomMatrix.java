package org.example.level9_3;

import java.util.Random;

public class RandomMatrix {
    public int[][] make(int rows, int columns) {
        System.out.println("Введите два целых числа");
        System.out.println(rows);
        System.out.println(columns);

        if (rows < 0) {
            rows = 0;
        }
        if (columns < 0) {
            columns = 0;
        }

        int[][] result = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = random.nextInt(10);
                System.out.print(result[i][j]);
                if (j < columns - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return result;
    }
}
