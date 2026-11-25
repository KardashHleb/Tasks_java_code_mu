package org.example.level5_5;

public class OddLettersCapitalizer {

    /** Capitalizes the 1st, 3rd, 5th... characters of the string. */
    public String capitalizeOdd(String text) {
        StringBuilder result = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            result.append(i % 2 == 0 ? Character.toUpperCase(current) : current);
        }
        return result.toString();
    }
}
