package org.example.level6_4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    private final Factorial factorial = new Factorial();

    @ParameterizedTest
    @CsvSource({"0, 1", "1, 1", "5, 120", "20, 2432902008176640000"})
    void computesFactorial(int number, long expected) {
        assertEquals(expected, factorial.of(number));
    }

    @Test
    void rejectsNegativeAndTooLarge() {
        assertThrows(IllegalArgumentException.class, () -> factorial.of(-1));
        assertThrows(IllegalArgumentException.class, () -> factorial.of(21));
    }
}
