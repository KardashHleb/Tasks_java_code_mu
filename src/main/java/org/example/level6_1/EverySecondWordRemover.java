package org.example.level6_1;

public class EverySecondWordRemover {
    public String remove(String str) {
        String result = "";
        String word = "";
        int wordNumber = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (word.length() > 0) {
                    wordNumber = wordNumber + 1;
                    if (wordNumber % 2 != 0) {
                        if (result.length() > 0) {
                            result = result + " ";
                        }
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
