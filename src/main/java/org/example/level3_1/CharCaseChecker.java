package org.example.level3_1;

public class CharCaseChecker {

    /** Possible results of the case check. */
    public enum CharCase {
        LOWERCASE, UPPERCASE, NOT_A_LETTER
    }

    /** Tells whether the character is a lowercase letter, an uppercase letter or not a letter at all. */
    public CharCase checkCase(char chr) {
        if (Character.isLowerCase(chr)) {
            return CharCase.LOWERCASE;
        }
        if (Character.isUpperCase(chr)) {
            return CharCase.UPPERCASE;
        }
        return CharCase.NOT_A_LETTER;
    }
}
