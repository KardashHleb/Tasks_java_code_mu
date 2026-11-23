package org.example.level3_8;

public class CamelToSnake {
    public String convert(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (Character.isUpperCase(current)) {
                if (i > 0) {
                    result = result + '_';
                }
                result = result + Character.toLowerCase(current);
            } else {
                result = result + current;
            }
        }

        System.out.println(result);
        return result;
    }
}
