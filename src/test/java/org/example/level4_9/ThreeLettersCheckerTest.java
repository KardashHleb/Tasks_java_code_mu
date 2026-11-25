package org.example.level4_9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeLettersCheckerTest {

    private final ThreeLettersChecker checker = new ThreeLettersChecker();

    @ParameterizedTest
    @CsvSource({"ab12, true", "a1b2c3, true", "abcd, false", "'', true"})
    void checksLetters(String str, boolean expected) {
        assertEquals(expected, checker.atMostThree(str));
    }
}
