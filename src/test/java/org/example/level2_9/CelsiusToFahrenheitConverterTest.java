package org.example.level2_9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CelsiusToFahrenheitConverterTest {

    private final CelsiusToFahrenheitConverter converter = new CelsiusToFahrenheitConverter();

    @ParameterizedTest
    @CsvSource({"0, 32", "100, 212", "-40, -40", "37, 98.6"})
    void converts(double celsius, double expected) {
        assertEquals(expected, converter.toFahrenheit(celsius), 1e-9);
    }

    @Test
    void rejectsBelowAbsoluteZero() {
        assertThrows(IllegalArgumentException.class, () -> converter.toFahrenheit(-300));
    }
}
