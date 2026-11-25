package org.example.level6_8;

import java.util.Arrays;

public class WordsAlphabetSorter {

    /** Sorts the words of a space-separated string in alphabetical order. */
    public String sort(String text) {
        String trimmed = text.trim();
        if (trimmed.isEmpty()) {
            return "";
        }
        String[] words = trimmed.split(" +");
        Arrays.sort(words);
        return String.join(" ", words);
    }
}
