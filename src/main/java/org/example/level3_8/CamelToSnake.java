package org.example.level3_8;

public class CamelToSnake {

    /** Converts camelCase to snake_case, e.g. "someVariableName" gives "some_variable_name". */
    public String convert(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (Character.isUpperCase(current)) {
                if (i > 0) {
                    result.append('_');
                }
                result.append(Character.toLowerCase(current));
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }
}
