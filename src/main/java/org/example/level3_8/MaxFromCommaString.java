package org.example.level3_8;

public class MaxFromCommaString {

    /** Returns the largest integer in a comma-separated string such as "3,17,-4". */
    public int findMax(String str) {
        if (str.isBlank()) {
            throw new IllegalArgumentException("String must contain at least one number");
        }
        String[] parts = str.split(",");
        int max = parse(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            max = Math.max(max, parse(parts[i]));
        }
        return max;
    }

    private int parse(String part) {
        try {
            return Integer.parseInt(part.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Not an integer: \"" + part + "\"", e);
        }
    }
}
