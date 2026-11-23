package org.example.level4_10;

public class EverySecondWordCapitalizer {
    public String capitalize(String str) {
        String result = "";
        String word = "";
        int wordNumber = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (word.length() > 0) {
                    wordNumber = wordNumber + 1;
                    if (result.length() > 0) {
                        result = result + " ";
                    }
                    if (wordNumber % 2 == 0) {
                        result = result + Character.toUpperCase(word.charAt(0));
                        for (int j = 1; j < word.length(); j++) {
                            result = result + word.charAt(j);
                        }
                    } else {
                        result = result + word;
                    }
                    word = "";
                }
            } else {
                word = word + str.charAt(i);
            }
        }

        System.out.println(result);
        return result;
    }
}
