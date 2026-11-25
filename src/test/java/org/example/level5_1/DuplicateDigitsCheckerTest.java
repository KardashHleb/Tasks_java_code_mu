package org.example.level5_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateDigitsCheckerTest {

    private final DuplicateDigitsChecker checker = new DuplicateDigitsChecker();

    @ParameterizedTest
    @CsvSource({"12341, true", "1234, false", "0, false", "-505, true", "7, false", "2147483647, true"})
    void detectsDuplicateDigits(int number, boolean expected) {
        assertEquals(expected, checker.hasDuplicateDigits(number));
    }
}
