package org.example.level1_3;

public class PenultimateCharFinder {

    /** Returns the second-to-last character of the string. */
    public char penultimateChar(String str) {
        if (str == null || str.length() < 2) {
            throw new IllegalArgumentException("String must contain at least two characters: " + str);
        }
        return str.charAt(str.length() - 2);
    }
}
