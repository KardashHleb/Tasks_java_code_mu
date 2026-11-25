package org.example.level3_7;

public class CommaNumbersSum {

    /** Sums the integers in a comma-separated string such as "1,2,3"; an empty string gives 0. */
    public int sum(String str) {
        if (str.isBlank()) {
            return 0;
        }
        int sum = 0;
        for (String part : str.split(",")) {
            sum += parse(part);
        }
        return sum;
    }

    private int parse(String part) {
        try {
            return Integer.parseInt(part.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Not an integer: \"" + part + "\"", e);
        }
    }
}
