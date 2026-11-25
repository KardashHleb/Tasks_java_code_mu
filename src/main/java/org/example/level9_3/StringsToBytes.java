package org.example.level9_3;

public class StringsToBytes {

    /** Converts every string of digits into a byte array of those digits, e.g. "123" -> {1, 2, 3}. */
    public byte[][] convert(String[] rows) {
        byte[][] result = new byte[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            result[i] = new byte[rows[i].length()];
            for (int j = 0; j < rows[i].length(); j++) {
                char current = rows[i].charAt(j);
                if (current < '0' || current > '9') {
                    throw new IllegalArgumentException("Not a digit: '" + current + "' in \"" + rows[i] + "\"");
                }
                result[i][j] = (byte) (current - '0');
            }
        }
        return result;
    }
}
