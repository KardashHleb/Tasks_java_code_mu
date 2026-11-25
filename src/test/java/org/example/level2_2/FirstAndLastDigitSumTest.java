package org.example.level2_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstAndLastDigitSumTest {

    private final FirstAndLastDigitSum summer = new FirstAndLastDigitSum();

    @ParameterizedTest
    @CsvSource({"12345, 6", "9, 18", "0, 0", "-708, 15", "-2147483648, 10"})
    void sumsFirstAndLastDigits(int number, int expected) {
        assertEquals(expected, summer.sumFirstAndLast(number));
    }
}
