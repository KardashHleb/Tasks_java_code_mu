package org.example.level3_9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryConverterTest {

    private final BinaryConverter converter = new BinaryConverter();

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "10, 1010", "255, 11111111", "-5, -101"})
    void convertsToBinary(int number, String expected) {
        assertEquals(expected, converter.toBinary(number));
    }

    @ParameterizedTest
    @CsvSource({"2147483647", "-2147483648", "12345"})
    void matchesStandardLibrary(int number) {
        String expected = (number < 0 ? "-" : "") + Long.toBinaryString(Math.abs((long) number));
        assertEquals(expected, converter.toBinary(number));
    }
}
