package org.example.level5_9;

public class OnesToZerosReplacer {

    /** Replaces every character '1' with '0' in each string of the array. */
    public String[] replace(String[] texts) {
        String[] result = new String[texts.length];
        for (int i = 0; i < texts.length; i++) {
            result[i] = texts[i].replace('1', '0');
        }
        return result;
    }
}
