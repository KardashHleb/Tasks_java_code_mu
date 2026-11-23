package org.example.level9_5;

public class LongestWord {
    public String find(String text) {
        String result = "";
        String word = "";

        for (int i = 0; i <= text.length(); i++) {
            boolean boundary = i == text.length() || !Character.isLetterOrDigit(text.charAt(i));
            if (boundary) {
                if (word.length() > result.length()) {
                    result = word;
                }
                word = "";
            } else {
                word = word + text.charAt(i);
            }
        }

        System.out.println(result);
        return result;
    }
}
