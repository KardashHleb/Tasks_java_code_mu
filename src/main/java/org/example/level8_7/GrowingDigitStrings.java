package org.example.level8_7;

public class GrowingDigitStrings {

    private static final int ROWS = 5;

    /** Returns the rows "1", "12", "123", "1234", "12345". */
    public String[] make() {
        String[] result = new String[ROWS];
        StringBuilder row = new StringBuilder();
        for (int i = 1; i <= ROWS; i++) {
            row.append(i);
            result[i - 1] = row.toString();
        }
        return result;
    }
}
