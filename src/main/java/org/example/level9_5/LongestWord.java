package org.example.level9_5;

public class LongestWord {

    /** Returns the longest word of the text (the first one on a tie), or an empty string if there are no words. */
    public String find(String text) {
        String result = "";
        int start = -1;
        for (int i = 0; i <= text.length(); i++) {
            boolean letter = i < text.length() && Character.isLetterOrDigit(text.charAt(i));
            if (letter && start < 0) {
                start = i;
            } else if (!letter && start >= 0) {
                if (i - start > result.length()) {
                    result = text.substring(start, i);
                }
                start = -1;
            }
        }
        return result;
    }
}
