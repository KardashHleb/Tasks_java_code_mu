package org.example.level7_10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LetterCaseCheckerTest {

    private final LetterCaseChecker task = new LetterCaseChecker();

    @ParameterizedTest
    @CsvSource({"A, upper", "z, lower", "7, not a letter", "'?', not a letter"})
    void checksCase(char symbol, String expected) {
        assertEquals(expected, task.check(symbol));
    }
}
