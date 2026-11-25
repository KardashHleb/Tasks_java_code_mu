package org.example.level5_5;

public class UniqueCharsKeeper {

    /** Removes repeated characters, keeping the first occurrence of each. */
    public String keepUnique(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (result.indexOf(String.valueOf(current)) < 0) {
                result.append(current);
            }
        }
        return result.toString();
    }
}
