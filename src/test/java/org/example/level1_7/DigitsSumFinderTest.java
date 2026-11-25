package org.example.level1_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsSumFinderTest {

    private final DigitsSumFinder finder = new DigitsSumFinder();

    @ParameterizedTest
    @CsvSource({"12345, 15", "0, 0", "-99, 18", "-2147483648, 47"})
    void sumsDigits(int number, int expected) {
        assertEquals(expected, finder.sumDigits(number));
    }
}
