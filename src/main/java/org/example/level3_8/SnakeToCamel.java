package org.example.level3_8;

public class SnakeToCamel {

    /** Converts snake_case to camelCase, e.g. "var_test_text" gives "varTestText". */
    public String convert(String str) {
        StringBuilder result = new StringBuilder();
        boolean upperNext = false;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '_') {
                upperNext = true;
            } else if (upperNext) {
                result.append(Character.toUpperCase(current));
                upperNext = false;
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }
}
