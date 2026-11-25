package org.example.level3_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainsZeroCheckerTest {

    private final ContainsZeroChecker checker = new ContainsZeroChecker();

    @ParameterizedTest
    @CsvSource({"105, true", "123, false", "0, true", "-2001, true", "-7, false"})
    void detectsZeroDigit(int number, boolean expected) {
        assertEquals(expected, checker.containsZero(number));
    }
}
