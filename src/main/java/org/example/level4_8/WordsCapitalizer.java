package org.example.level4_8;

public class WordsCapitalizer {
    public String capitalize(String str) {
        String result = "";
        boolean newWord = true;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == ' ') {
                result = result + current;
                newWord = true;
            } else if (newWord) {
                result = result + Character.toUpperCase(current);
                newWord = false;
            } else {
                result = result + current;
            }
        }

        System.out.println(result);
        return result;
    }
}
