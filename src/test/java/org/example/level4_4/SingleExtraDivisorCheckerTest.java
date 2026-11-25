package org.example.level4_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleExtraDivisorCheckerTest {

    private final SingleExtraDivisorChecker checker = new SingleExtraDivisorChecker();

    @ParameterizedTest
    @CsvSource({"4, true", "9, true", "49, true", "-25, true", "6, false", "7, false", "16, false", "1, false", "0, false"})
    void checksDivisors(int number, boolean expected) {
        assertEquals(expected, checker.hasSingleExtraDivisor(number));
    }
}
