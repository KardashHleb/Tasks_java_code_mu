package org.example.level8_6;

public class XRowsArray {

    private static final int ROWS = 5;

    /** Returns the rows "x", "xx", ..., "xxxxx", each one character longer than the previous. */
    public String[] make() {
        String[] result = new String[ROWS];
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            row.append('x');
            result[i] = row.toString();
        }
        return result;
    }
}
