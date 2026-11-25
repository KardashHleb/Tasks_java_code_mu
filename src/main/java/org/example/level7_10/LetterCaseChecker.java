package org.example.level7_10;

public class LetterCaseChecker {

    /** Returns "upper" or "lower" for a letter depending on its case, and "not a letter" otherwise. */
    public String check(char symbol) {
        if (!Character.isLetter(symbol)) {
            return "not a letter";
        }
        return Character.isUpperCase(symbol) ? "upper" : "lower";
    }
}
