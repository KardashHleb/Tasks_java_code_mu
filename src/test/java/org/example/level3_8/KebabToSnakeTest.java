package org.example.level3_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KebabToSnakeTest {

    private final KebabToSnake task = new KebabToSnake();

    @ParameterizedTest
    @CsvSource({"var-test-text, var_test_text", "plain, plain", "'', ''"})
    void converts(String input, String expected) {
        assertEquals(expected, task.convert(input));
    }
}
