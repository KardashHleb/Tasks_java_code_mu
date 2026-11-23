package org.example.level6_4;

public class LongWordsRemover {
    public String remove(String str) {
        String result = "";
        String word = "";

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (word.length() > 0 && word.length() <= 3) {
                    if (result.length() > 0) {
                        result = result + " ";
                    }
                    result = result + word;
                }
                word = "";
            } else {
                word = word + str.charAt(i);
            }
        }

        System.out.println(result);
        return result;
    }
}
