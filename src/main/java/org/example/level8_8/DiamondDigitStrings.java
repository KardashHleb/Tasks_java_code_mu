package org.example.level8_8;

public class DiamondDigitStrings {

    private static final int MAX_LENGTH = 5;

    /** Returns the rows "1", "12", ..., "12345", ..., "12", "1": lengths grow to five and shrink back. */
    public String[] make() {
        String[] result = new String[2 * MAX_LENGTH - 1];
        for (int i = 0; i < result.length; i++) {
            int length = i < MAX_LENGTH ? i + 1 : result.length - i;
            StringBuilder row = new StringBuilder();
            for (int digit = 1; digit <= length; digit++) {
                row.append(digit);
            }
            result[i] = row.toString();
        }
        return result;
    }
}
