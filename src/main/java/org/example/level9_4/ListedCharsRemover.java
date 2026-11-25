package org.example.level9_4;

public class ListedCharsRemover {

    /** Removes from the text every character that occurs in {@code charsToRemove}. */
    public String remove(String text, String charsToRemove) {
        StringBuilder result = new StringBuilder();
        for (char current : text.toCharArray()) {
            if (charsToRemove.indexOf(current) < 0) {
                result.append(current);
            }
        }
        return result.toString();
    }
}
