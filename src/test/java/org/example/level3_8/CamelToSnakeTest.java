package org.example.level3_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CamelToSnakeTest {

    private final CamelToSnake task = new CamelToSnake();

    @ParameterizedTest
    @CsvSource({"someVariableName, some_variable_name", "Name, name", "lower, lower", "'', ''"})
    void converts(String input, String expected) {
        assertEquals(expected, task.convert(input));
    }
}
