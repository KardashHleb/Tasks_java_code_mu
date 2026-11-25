package org.example.level6_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerValueCheckerTest {

    @ParameterizedTest
    @CsvSource({"123, true", "-45, true", "0, true", "-, false", "'', false", "12.5, false", "1a, false"})
    void checksInteger(String text, boolean expected) {
        assertEquals(expected, new IntegerValueChecker().isInteger(text));
    }
}
