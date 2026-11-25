package org.example.level2_8;

public class FirstAndLastCharsMerger {

    /** Returns a two-character string made of the first and the last character of the input. */
    public String mergeFirstAndLast(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be empty");
        }
        return new StringBuilder(2).append(str.charAt(0)).append(str.charAt(str.length() - 1)).toString();
    }
}
