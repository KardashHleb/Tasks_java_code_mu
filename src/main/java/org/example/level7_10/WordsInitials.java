package org.example.level7_10;

public class WordsInitials {

    /** Returns the first letters of all space-separated words, upper-cased ("hello big world" -> "HBW"). */
    public String initials(String text) {
        StringBuilder result = new StringBuilder();
        boolean wordStart = true;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == ' ') {
                wordStart = true;
            } else if (wordStart) {
                result.append(Character.toUpperCase(current));
                wordStart = false;
            }
        }
        return result.toString();
    }
}
