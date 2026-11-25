package org.example.level3_5;

public class WordCounter {

    /** Counts the words in the string; words are separated by one or more spaces. */
    public int countWords(String str) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }
}
