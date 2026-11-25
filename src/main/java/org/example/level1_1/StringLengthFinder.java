package org.example.level1_1;

public class StringLengthFinder {

    /** Returns the number of characters in the string. */
    public int length(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String must not be null");
        }
        return str.length();
    }
}
