package org.example.level4_3;

public class SpaceNumbersSum {

    /** Sums the integers in a space-separated string such as "1 2 3"; a blank string gives 0. */
    public int sum(String str) {
        String trimmed = str.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (String part : trimmed.split(" +")) {
            try {
                sum += Integer.parseInt(part);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Not an integer: \"" + part + "\"", e);
            }
        }
        return sum;
    }
}
