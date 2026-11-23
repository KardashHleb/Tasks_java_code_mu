package org.example.level8_1;

public class TripleBlocksArray {
    public int[][][] make() {
        int[][][] result = new int[3][3][3];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < result[i][j].length; k++) {
                    result[i][j][k] = k + 1;
                    System.out.print(result[i][j][k]);
                    if (k < result[i][j].length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        return result;
    }
}
