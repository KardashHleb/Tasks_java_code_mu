package org.example.level1_7;

public class NumberStringsSummer {

    /** Parses three strings as integers and returns their sum. */
    public long sumNumberStrings(String str1, String str2, String str3) {
        return parse(str1) + parse(str2) + parse(str3);
    }

    private static long parse(String str) {
        try {
            return Integer.parseInt(str.trim());
        } catch (NumberFormatException | NullPointerException e) {
            throw new IllegalArgumentException("Not an integer: " + str, e);
        }
    }
}
