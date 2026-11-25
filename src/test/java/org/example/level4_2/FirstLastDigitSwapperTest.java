package org.example.level4_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstLastDigitSwapperTest {

    private final FirstLastDigitSwapper task = new FirstLastDigitSwapper();

    @ParameterizedTest
    @CsvSource({"12345, 52341", "12, 21", "7, 7", "0, 0", "120, 21", "-1239, -9231"})
    void swapsDigits(int number, int expected) {
        assertEquals(expected, task.swap(number));
    }
}
