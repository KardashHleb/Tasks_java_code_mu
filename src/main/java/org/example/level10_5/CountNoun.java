package org.example.level10_5;

import org.example.level10_3.EnglishPlural;

public class CountNoun {

    private final EnglishPlural plurals = new EnglishPlural();

    /** Writes a number with the matching noun form: 1 -> "1 apple", 0 or 5 -> "0 apples", "5 apples". */
    public String form(int number, String singular, String plural) {
        boolean one = number == 1 || number == -1;
        return number + " " + (one ? singular : plural);
    }

    /** Same as {@link #form(int, String, String)} with the plural built by the regular English rules. */
    public String form(int number, String singular) {
        return form(number, singular, plurals.plural(singular));
    }
}
