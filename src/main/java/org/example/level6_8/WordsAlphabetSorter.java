package org.example.level6_8;

public class WordsAlphabetSorter {
    public String sort(String str) {
        int wordCount = 0;
        String word = "";

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (word.length() > 0) {
                    wordCount = wordCount + 1;
                    word = "";
                }
            } else {
                word = word + str.charAt(i);
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        word = "";

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (word.length() > 0) {
                    words[index] = word;
                    index = index + 1;
                    word = "";
                }
            } else {
                word = word + str.charAt(i);
            }
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result = result + " ";
            }
            result = result + words[i];
        }

        System.out.println(result);
        return result;
    }
}
