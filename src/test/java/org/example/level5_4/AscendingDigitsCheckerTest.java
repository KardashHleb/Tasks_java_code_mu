package org.example.level5_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AscendingDigitsCheckerTest {

    @ParameterizedTest
    @CsvSource({"1234, true", "1324, false", "1123, false", "7, true", "0, true", "-159, true", "21, false"})
    void checksAscendingDigits(int number, boolean expected) {
        assertEquals(expected, new AscendingDigitsChecker().isAscending(number));
    }
}
