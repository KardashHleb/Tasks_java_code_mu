package org.example.level3_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThirdZeroPositionTest {

    private final ThirdZeroPosition task = new ThirdZeroPosition();

    @ParameterizedTest
    @CsvSource({"10203040, 5", "000, 2", "1020, -1", "'', -1"})
    void findsThirdZero(String str, int expected) {
        assertEquals(expected, task.findThirdZero(str));
    }
}
