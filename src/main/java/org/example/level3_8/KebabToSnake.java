package org.example.level3_8;

public class KebabToSnake {
    public String convert(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '-') {
                result = result + '_';
            } else {
                result = result + current;
            }
        }

        System.out.println(result);
        return result;
    }
}
