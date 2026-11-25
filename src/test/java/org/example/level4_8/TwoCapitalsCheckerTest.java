package org.example.level4_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoCapitalsCheckerTest {

    private final TwoCapitalsChecker checker = new TwoCapitalsChecker();

    @ParameterizedTest
    @CsvSource({"Hello World, true", "ABc, true", "ABC, false", "'', true"})
    void checksCapitals(String str, boolean expected) {
        assertEquals(expected, checker.atMostTwo(str));
    }
}
