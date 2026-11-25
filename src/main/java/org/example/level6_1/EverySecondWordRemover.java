package org.example.level6_1;

import java.util.StringJoiner;

public class EverySecondWordRemover {

    /** Removes the 2nd, 4th, 6th... word from a space-separated string. */
    public String remove(String text) {
        StringJoiner result = new StringJoiner(" ");
        String trimmed = text.trim();
        if (trimmed.isEmpty()) {
            return "";
        }
        String[] words = trimmed.split(" +");
        for (int i = 0; i < words.length; i += 2) {
            result.add(words[i]);
        }
        return result.toString();
    }
}
