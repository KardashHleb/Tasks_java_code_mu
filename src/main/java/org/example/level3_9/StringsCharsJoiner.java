package org.example.level3_9;

public class StringsCharsJoiner {

    /** Joins the characters of all strings of the array into one char array, in order. */
    public char[] joinChars(String[] arr) {
        return String.join("", arr).toCharArray();
    }
}
