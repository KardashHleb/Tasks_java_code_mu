package org.example.level4_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaseTogglerTest {

    private final CaseToggler task = new CaseToggler();

    @ParameterizedTest
    @CsvSource({"Hello World, hELLO wORLD", "abc123, ABC123", "'', ''"})
    void togglesCase(String input, String expected) {
        assertEquals(expected, task.toggle(input));
    }
}
