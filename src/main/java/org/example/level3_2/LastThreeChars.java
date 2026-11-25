package org.example.level3_2;

public class LastThreeChars {

    /** Returns the last three characters of the string. */
    public String lastThree(String str) {
        if (str.length() < 3) {
            throw new IllegalArgumentException("String must contain at least 3 characters: \"" + str + "\"");
        }
        return str.substring(str.length() - 3);
    }
}
