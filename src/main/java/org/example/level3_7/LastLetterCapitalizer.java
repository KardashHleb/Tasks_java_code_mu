package org.example.level3_7;

public class LastLetterCapitalizer {
    public String capitalizeLastLetters(String str) {
        String result = "";
        String word = "";

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (word.length() > 0) {
                    if (result.length() > 0) {
                        result = result + " ";
                    }
                    result = result + capitalizeLast(word);
                    word = "";
                }
            } else {
                word = word + str.charAt(i);
            }
        }

        System.out.println(result);
        return result;
    }

    private String capitalizeLast(String word) {
        String result = "";

        for (int i = 0; i < word.length() - 1; i++) {
            result = result + word.charAt(i);
        }

        char last = word.charAt(word.length() - 1);
        result = result + Character.toUpperCase(last);
        return result;
    }
}
