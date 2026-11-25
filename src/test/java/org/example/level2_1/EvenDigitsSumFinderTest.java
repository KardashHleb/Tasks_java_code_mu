package org.example.level2_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenDigitsSumFinderTest {

    private final EvenDigitsSumFinder finder = new EvenDigitsSumFinder();

    @ParameterizedTest
    @CsvSource({"123456, 12", "13579, 0", "0, 0", "-248, 14"})
    void sumsEvenDigits(int number, int expected) {
        assertEquals(expected, finder.sumEvenDigits(number));
    }
}
