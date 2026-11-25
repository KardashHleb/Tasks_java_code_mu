package org.example.level3_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakeToCamelTest {

    private final SnakeToCamel task = new SnakeToCamel();

    @ParameterizedTest
    @CsvSource({"var_test_text, varTestText", "plain, plain", "a__b, aB", "'', ''"})
    void converts(String input, String expected) {
        assertEquals(expected, task.convert(input));
    }
}
