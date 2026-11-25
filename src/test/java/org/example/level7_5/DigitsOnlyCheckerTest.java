package org.example.level7_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DigitsOnlyCheckerTest {

    private final DigitsOnlyChecker task = new DigitsOnlyChecker();

    @ParameterizedTest
    @CsvSource({"12345, true", "0, true", "12a4, false", "-12, false", "1.5, false", "'', false"})
    void checksDigits(String text, boolean expected) {
        assertEquals(expected, task.containsOnlyDigits(text));
    }
}
