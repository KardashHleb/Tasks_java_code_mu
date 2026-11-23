package org.example.level10_3;

public class EnglishPlural {
    public String plural(String noun) {
        String result = noun + "s";
        if (ends(noun, "s") || ends(noun, "x") || ends(noun, "z") || ends(noun, "ch") || ends(noun, "sh")) {
            result = noun + "es";
        } else if (noun.length() >= 2 && noun.charAt(noun.length() - 1) == 'y') {
            char before = Character.toLowerCase(noun.charAt(noun.length() - 2));
            if (before != 'a' && before != 'e' && before != 'i' && before != 'o' && before != 'u') {
                result = noun.substring(0, noun.length() - 1) + "ies";
            }
        } else if (ends(noun, "fe")) {
            result = noun.substring(0, noun.length() - 2) + "ves";
        } else if (ends(noun, "f") && !ends(noun, "ff")) {
            result = noun.substring(0, noun.length() - 1) + "ves";
        }

        System.out.println(result);
        return result;
    }

    private boolean ends(String word, String ending) {
        if (word.length() < ending.length()) {
            return false;
        }
        String tail = "";
        for (int i = word.length() - ending.length(); i < word.length(); i++) {
            tail = tail + Character.toLowerCase(word.charAt(i));
        }
        return tail.equals(ending);
    }
}
