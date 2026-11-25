package org.example.level3_1;

public class FirstThreeChars {

    /** Returns the first three characters of the string. */
    public String firstThree(String str) {
        if (str.length() < 3) {
            throw new IllegalArgumentException("String must contain at least 3 characters: \"" + str + "\"");
        }
        return str.substring(0, 3);
    }
}
