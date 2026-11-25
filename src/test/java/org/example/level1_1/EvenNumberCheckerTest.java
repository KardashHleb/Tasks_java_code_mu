package org.example.level1_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenNumberCheckerTest {

    private final EvenNumberChecker checker = new EvenNumberChecker();

    @ParameterizedTest
    @CsvSource({"4, true", "7, false", "0, true", "-2, true", "-3, false"})
    void detectsEvenNumbers(int number, boolean expected) {
        assertEquals(expected, checker.isEven(number));
    }
}
