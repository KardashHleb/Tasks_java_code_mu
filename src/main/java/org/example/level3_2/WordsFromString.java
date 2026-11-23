package org.example.level3_2;

public class WordsFromString {
    public String[] toWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!inWord) {
                    count = count + 1;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String[] words = new String[count];
        String current = "";
        int index = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (current.length() > 0) {
                    words[index] = current;
                    System.out.println(words[index]);
                    index = index + 1;
                    current = "";
                }
            } else {
                current = current + str.charAt(i);
            }
        }

        return words;
    }
}
