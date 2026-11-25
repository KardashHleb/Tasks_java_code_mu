package org.example.level6_4;

import java.util.StringJoiner;

public class LongWordsRemover {

    /** Removes all words longer than three characters from a space-separated string. */
    public String remove(String text) {
        StringJoiner result = new StringJoiner(" ");
        for (String word : text.split(" ")) {
            if (!word.isEmpty() && word.length() <= 3) {
                result.add(word);
            }
        }
        return result.toString();
    }
}
