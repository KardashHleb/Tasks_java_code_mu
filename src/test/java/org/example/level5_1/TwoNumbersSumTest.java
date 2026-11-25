package org.example.level5_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoNumbersSumTest {

    @ParameterizedTest
    @CsvSource({"2, 3, 5", "-4, 4, 0", "0, 0, 0", "2147483647, 1, 2147483648"})
    void addsNumbers(int first, int second, long expected) {
        assertEquals(expected, new TwoNumbersSum().sum(first, second));
    }
}
