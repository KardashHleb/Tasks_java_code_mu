package org.example.level3_1;

import org.example.level3_1.CharCaseChecker.CharCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharCaseCheckerTest {

    private final CharCaseChecker checker = new CharCaseChecker();

    @Test
    void lowercaseLetter() {
        assertEquals(CharCase.LOWERCASE, checker.checkCase('a'));
    }

    @Test
    void uppercaseLetter() {
        assertEquals(CharCase.UPPERCASE, checker.checkCase('Z'));
    }

    @Test
    void digitIsNotALetter() {
        assertEquals(CharCase.NOT_A_LETTER, checker.checkCase('7'));
    }
}
