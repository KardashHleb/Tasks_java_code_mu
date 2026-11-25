package org.example.level5_7;

public class CommonCharsKeeper {

    /** Returns the distinct characters of the first string that also occur in the second one. */
    public String keep(String first, String second) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            String current = String.valueOf(first.charAt(i));
            if (second.contains(current) && result.indexOf(current) < 0) {
                result.append(current);
            }
        }
        return result.toString();
    }
}
