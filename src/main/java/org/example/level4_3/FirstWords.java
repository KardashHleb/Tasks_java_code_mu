package org.example.level4_3;

public class FirstWords {
    public String takeFirst(String str, int count) {
        String result = "";
        String word = "";
        int found = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (word.length() > 0 && found < count) {
                    if (result.length() > 0) {
                        result = result + " ";
                    }
                    result = result + word;
                    found = found + 1;
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
