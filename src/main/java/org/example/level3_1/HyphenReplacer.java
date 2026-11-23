package org.example.level3_1;

public class HyphenReplacer {
    public String replaceHyphens(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '-') {
                result = result + ' ';
            } else {
                result = result + current;
            }
        }

        System.out.println(result);
        return result;
    }
}
