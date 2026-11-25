package org.example.level2_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialFinderTest {

    private final FactorialFinder finder = new FactorialFinder();

    @ParameterizedTest
    @CsvSource({"0, 1", "1, 1", "5, 120", "20, 2432902008176640000"})
    void computesFactorial(int n, long expected) {
        assertEquals(expected, finder.factorial(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 21})
    void rejectsOutOfRange(int n) {
        assertThrows(IllegalArgumentException.class, () -> finder.factorial(n));
    }
}
