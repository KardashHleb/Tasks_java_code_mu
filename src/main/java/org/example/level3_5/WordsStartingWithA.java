package org.example.level3_5;

import java.util.Arrays;

public class WordsStartingWithA {

    /** Returns the words of the text that start with a lowercase letter 'a'. */
    public String[] collect(String text) {
        return Arrays.stream(text.split(" +"))
                .filter(word -> word.startsWith("a"))
                .toArray(String[]::new);
    }
}
