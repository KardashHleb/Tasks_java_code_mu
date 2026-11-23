package org.example.level3_8;

public class SnakeToCamel {
    public String convert(String str) {
        String result = "";
        boolean upperNext = false;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '_') {
                upperNext = true;
            } else if (upperNext) {
                result = result + Character.toUpperCase(current);
                upperNext = false;
            } else {
                result = result + current;
            }
        }

        System.out.println(result);
        return result;
    }
}
