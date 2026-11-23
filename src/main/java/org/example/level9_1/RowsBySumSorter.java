package org.example.level9_1;

public class RowsBySumSorter {
    public int[][] sort(int[][] rows) {
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows.length - 1; j++) {
                if (sum(rows[j]) > sum(rows[j + 1])) {
                    int[] temp = rows[j];
                    rows[j] = rows[j + 1];
                    rows[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length; j++) {
                System.out.print(rows[i][j]);
                if (j < rows[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return rows;
    }

    private int sum(int[] row) {
        int result = 0;
        for (int i = 0; i < row.length; i++) {
            result = result + row[i];
        }
        return result;
    }
}
