package org.example.level4_6;

public class EverySecondChar {

    /** Returns the characters at even indexes: the first, the third, the fifth and so on. */
    public String take(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
