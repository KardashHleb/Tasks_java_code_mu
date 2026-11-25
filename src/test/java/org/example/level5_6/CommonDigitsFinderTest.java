package org.example.level5_6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonDigitsFinderTest {

    @ParameterizedTest
    @CsvSource({"12345, 5631, 135", "1122, 2211, 12", "123, 456, ''", "0, 101, 0", "-307, 70, 07"})
    void findsCommonDigits(int first, int second, String expected) {
        assertEquals(expected, new CommonDigitsFinder().find(first, second));
    }
}
