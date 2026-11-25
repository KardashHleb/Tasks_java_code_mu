package org.example.level7_10;

public class LetterScriptChecker {

    /** Returns "latin" for a Latin letter, "cyrillic" for a Russian Cyrillic letter and "not a letter" otherwise. */
    public String check(char symbol) {
        if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')) {
            return "latin";
        }
        // the Russian alphabet: lowercase and uppercase ranges plus the letter Yo, which lies outside them
        if ((symbol >= 'а' && symbol <= 'я')
                || (symbol >= 'А' && symbol <= 'Я')
                || symbol == 'ё' || symbol == 'Ё') {
            return "cyrillic";
        }
        return "not a letter";
    }
}
