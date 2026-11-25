package org.example.level4_7;

public class CaseToggler {

    /** Swaps the case of every letter: upper case becomes lower case and vice versa. */
    public String toggle(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (Character.isUpperCase(current)) {
                result.append(Character.toLowerCase(current));
            } else if (Character.isLowerCase(current)) {
                result.append(Character.toUpperCase(current));
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }
}
