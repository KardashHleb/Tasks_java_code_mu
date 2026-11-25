package org.example.level4_4;

public class VowelsRemover {

    private static final String VOWELS = "aeiouAEIOU";

    /** Removes all English vowels (a, e, i, o, u in either case) from the string. */
    public String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (VOWELS.indexOf(current) == -1) {
                result.append(current);
            }
        }
        return result.toString();
    }
}
