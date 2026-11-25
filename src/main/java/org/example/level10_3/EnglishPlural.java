package org.example.level10_3;

import java.util.Locale;

public class EnglishPlural {

    /** Plural of a regular English noun: box -> boxes, city -> cities, knife -> knives, cat -> cats. */
    public String plural(String noun) {
        if (noun == null || noun.isBlank()) {
            throw new IllegalArgumentException("Noun must not be empty");
        }
        String lower = noun.toLowerCase(Locale.ROOT);
        if (lower.endsWith("s") || lower.endsWith("x") || lower.endsWith("z")
                || lower.endsWith("ch") || lower.endsWith("sh")) {
            return noun + "es";
        }
        if (lower.length() >= 2 && lower.endsWith("y") && !isVowel(lower.charAt(lower.length() - 2))) {
            return noun.substring(0, noun.length() - 1) + "ies";
        }
        if (lower.endsWith("fe")) {
            return noun.substring(0, noun.length() - 2) + "ves";
        }
        if (lower.endsWith("f") && !lower.endsWith("ff")) {
            return noun.substring(0, noun.length() - 1) + "ves";
        }
        return noun + "s";
    }

    private static boolean isVowel(char letter) {
        return "aeiou".indexOf(letter) >= 0;
    }
}
