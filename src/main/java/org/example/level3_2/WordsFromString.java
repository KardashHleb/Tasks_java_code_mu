package org.example.level3_2;

public class WordsFromString {

    /** Splits the string into words separated by one or more spaces. */
    public String[] toWords(String str) {
        String trimmed = str.trim();
        if (trimmed.isEmpty()) {
            return new String[0];
        }
        return trimmed.split(" +");
    }
}
