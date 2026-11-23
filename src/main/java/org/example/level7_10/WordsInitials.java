package org.example.level7_10;

public class WordsInitials {
    public String initials(String text) {
        String result = "";
        boolean wordStart = true;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == ' ') {
                wordStart = true;
            } else if (wordStart) {
                result = result + Character.toUpperCase(current);
                wordStart = false;
            }
        }

        System.out.println(result);
        return result;
    }
}
