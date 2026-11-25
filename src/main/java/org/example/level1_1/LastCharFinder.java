package org.example.level1_1;

public class LastCharFinder {

    /** Returns the last character of the string. */
    public char lastChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be empty");
        }
        return str.charAt(str.length() - 1);
    }
}
