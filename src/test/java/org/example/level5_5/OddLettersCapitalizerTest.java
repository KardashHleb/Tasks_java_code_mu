package org.example.level5_5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddLettersCapitalizerTest {

    @ParameterizedTest
    @CsvSource({"abcdef, AbCdEf", "a, A", "'', ''", "hello world, HeLlO WoRlD"})
    void capitalizesOddPositions(String input, String expected) {
        assertEquals(expected, new OddLettersCapitalizer().capitalizeOdd(input));
    }
}
