package org.example.level3_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenDigitsStringCheckerTest {

    private final EvenDigitsStringChecker checker = new EvenDigitsStringChecker();

    @ParameterizedTest
    @CsvSource({"2468, true", "0, true", "2461, false", "24a, false", "'', false"})
    void checksString(String str, boolean expected) {
        assertEquals(expected, checker.onlyEvenDigits(str));
    }
}
