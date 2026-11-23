package org.example.level4_10;

public class ShortWordsUpper {
    public String convert(String str) {
        String result = "";
        String word = "";

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (word.length() > 0) {
                    if (result.length() > 0) {
                        result = result + " ";
                    }
                    if (word.length() <= 3) {
                        result = result + word.toUpperCase();
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
