package org.example.level1_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstAndLastDigitSumTest {

    private final FirstAndLastDigitSum summer = new FirstAndLastDigitSum();

    @ParameterizedTest
    @CsvSource({"12345, 6", "7, 14", "0, 0", "-908, 17"})
    void sumsFirstAndLastDigits(int number, int expected) {
        assertEquals(expected, summer.sumFirstAndLast(number));
    }
}
