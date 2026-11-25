package org.example.level3_6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AllDigitsPositiveCheckerTest {

    private final AllDigitsPositiveChecker checker = new AllDigitsPositiveChecker();

    @ParameterizedTest
    @CsvSource({"123, true", "105, false", "0, false", "-987, true", "10, false"})
    void checksDigits(int number, boolean expected) {
        assertEquals(expected, checker.allDigitsPositive(number));
    }
}
