package org.example.level1_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NegativeNumberCheckerTest {

    private final NegativeNumberChecker checker = new NegativeNumberChecker();

    @ParameterizedTest
    @CsvSource({"-5, true", "5, false", "0, false", "-2147483648, true"})
    void detectsNegativeNumbers(int number, boolean expected) {
        assertEquals(expected, checker.isNegative(number));
    }
}
