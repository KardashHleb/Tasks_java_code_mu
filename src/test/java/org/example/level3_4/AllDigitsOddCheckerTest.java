package org.example.level3_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AllDigitsOddCheckerTest {

    private final AllDigitsOddChecker checker = new AllDigitsOddChecker();

    @ParameterizedTest
    @CsvSource({"13579, true", "1357, true", "1234, false", "0, false", "-359, true", "7, true"})
    void checksDigits(int number, boolean expected) {
        assertEquals(expected, checker.allDigitsOdd(number));
    }
}
