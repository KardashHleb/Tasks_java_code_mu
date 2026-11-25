package org.example.level6_7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DigitPairsSumTest {

    private final DigitPairsSum summer = new DigitPairsSum();

    @ParameterizedTest
    @CsvSource({"123456, 102", "10, 10", "1005, 15", "-1234, 46"})
    void sumsPairs(int number, int expected) {
        assertEquals(expected, summer.sum(number));
    }

    @Test
    void rejectsOddDigitCount() {
        assertThrows(IllegalArgumentException.class, () -> summer.sum(123));
        assertThrows(IllegalArgumentException.class, () -> summer.sum(0));
    }
}
