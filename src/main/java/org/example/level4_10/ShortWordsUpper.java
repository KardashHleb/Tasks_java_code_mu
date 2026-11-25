package org.example.level4_10;

public class ShortWordsUpper {

    /** Converts words of up to three characters to upper case; words are separated by spaces. */
    public String convert(String str) {
        StringBuilder result = new StringBuilder();
        for (String word : str.trim().split(" +")) {
            if (word.isEmpty()) {
                continue;
            }
            if (!result.isEmpty()) {
                result.append(' ');
            }
            result.append(word.length() <= 3 ? word.toUpperCase() : word);
        }
        return result.toString();
    }
}
