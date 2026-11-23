package org.example.level3_5;

public class WordCounter {
    public int countWords(String str) {
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

        System.out.println(count);
        return count;
    }
}
