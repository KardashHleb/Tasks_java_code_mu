package org.example.level4_7;

public class CaseToggler {
    public String toggle(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (Character.isUpperCase(current)) {
                result = result + Character.toLowerCase(current);
            } else if (Character.isLowerCase(current)) {
                result = result + Character.toUpperCase(current);
            } else {
                result = result + current;
            }
        }

        System.out.println(result);
        return result;
    }
}
