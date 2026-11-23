package org.example.level9_3;

public class StringsToBytes {
    public byte[][] convert(String[] rows) {
        byte[][] result = new byte[rows.length][];

        for (int i = 0; i < rows.length; i++) {
            result[i] = new byte[rows[i].length()];
            for (int j = 0; j < rows[i].length(); j++) {
                result[i][j] = (byte) (rows[i].charAt(j) - '0');
                System.out.print(result[i][j]);
                if (j < rows[i].length() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        return result;
    }
}
