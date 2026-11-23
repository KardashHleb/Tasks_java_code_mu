package org.example.level3_5;

public class WordsStartingWithA {
    public String[] collect(String text) {
        int count = 0;
        String current = "";

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                if (current.length() > 0 && current.charAt(0) == 'a') {
                    count = count + 1;
                }
                current = "";
            } else {
                current = current + text.charAt(i);
            }
        }

        String[] words = new String[count];
        int index = 0;
        current = "";

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                if (current.length() > 0 && current.charAt(0) == 'a') {
                    words[index] = current;
                    System.out.println(words[index]);
                    index = index + 1;
                }
                current = "";
            } else {
                current = current + text.charAt(i);
            }
        }

        return words;
    }
}
