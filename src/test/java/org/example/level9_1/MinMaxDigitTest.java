package org.example.level9_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MinMaxDigitTest {

    private final MinMaxDigit task = new MinMaxDigit();

    @ParameterizedTest
    @CsvSource({
            "3941, 1, 9",
            "0, 0, 0",
            "7, 7, 7",
            "-508, 0, 8",
            "-2147483648, 1, 8"
    })
    void findsSmallestAndLargestDigit(int number, int min, int max) {
        assertEquals(new MinMaxDigit.MinMax(min, max), task.find(number));
    }
}
