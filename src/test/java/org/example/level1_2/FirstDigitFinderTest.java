package org.example.level1_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstDigitFinderTest {

    private final FirstDigitFinder finder = new FirstDigitFinder();

    @ParameterizedTest
    @CsvSource({"4567, 4", "0, 0", "-89, 8", "7, 7"})
    void findsFirstDigit(int number, int expected) {
        assertEquals(expected, finder.firstDigit(number));
    }
}
