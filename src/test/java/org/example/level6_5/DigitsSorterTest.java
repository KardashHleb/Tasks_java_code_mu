package org.example.level6_5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsSorterTest {

    @ParameterizedTest
    @CsvSource({"3142, 1234", "3021, 123", "0, 0", "-531, -135", "2147483647, 1234446778"})
    void sortsDigits(int number, long expected) {
        assertEquals(expected, new DigitsSorter().sort(number));
    }
}
