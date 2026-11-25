package org.example.level4_6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EverySecondCharTest {

    private final EverySecondChar task = new EverySecondChar();

    @ParameterizedTest
    @CsvSource({"abcdef, ace", "abcde, ace", "a, a", "'', ''"})
    void takesEverySecondChar(String input, String expected) {
        assertEquals(expected, task.take(input));
    }
}
