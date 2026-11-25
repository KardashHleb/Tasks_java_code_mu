package org.example.level4_9;

public class EveryThirdCharRemover {

    /** Removes every third character (the 3rd, 6th, 9th, ...) from the string. */
    public String remove(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % 3 != 0) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
