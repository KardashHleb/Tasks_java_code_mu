package org.example.level5_4;

public class XMatrixBuilder {
    public char[][] build() {
        char[][] arr = new char[3][3];

        for (int i = 0; i < arr.length; i++) {
            String row = "";
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 'x';
                row = row + arr[i][j];
            }
            System.out.println(row);
        }

        return arr;
    }
}
