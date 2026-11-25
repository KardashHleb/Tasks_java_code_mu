package org.example.level1_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastDigitFinderTest {

    private final LastDigitFinder finder = new LastDigitFinder();

    @ParameterizedTest
    @CsvSource({"1234, 4", "0, 0", "-57, 7", "-2147483648, 8"})
    void findsLastDigit(int number, int expected) {
        assertEquals(expected, finder.lastDigit(number));
    }
}
