package org.example.level4_6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OnlyDigitsCheckerTest {

    private final OnlyDigitsChecker checker = new OnlyDigitsChecker();

    @ParameterizedTest
    @CsvSource({"12345, true", "0, true", "12a45, false", "-12, false", "'', false"})
    void checksDigits(String str, boolean expected) {
        assertEquals(expected, checker.onlyDigits(str));
    }
}
