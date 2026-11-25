package org.example.level7_10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LetterScriptCheckerTest {

    private final LetterScriptChecker task = new LetterScriptChecker();

    @ParameterizedTest
    @CsvSource({
            "a, latin", "Z, latin",
            "ж, cyrillic", "Я, cyrillic", "ё, cyrillic", "Ё, cyrillic",
            "5, not a letter", "é, not a letter"
    })
    void detectsScript(char symbol, String expected) {
        assertEquals(expected, task.check(symbol));
    }
}
