package org.example.level1_5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisibleWithoutRemainderCheckerTest {

    private final DivisibleWithoutRemainderChecker checker = new DivisibleWithoutRemainderChecker();

    @ParameterizedTest
    @CsvSource({"10, 5, true", "10, 3, false", "0, 7, true", "-9, 3, true"})
    void checksDivisibility(int dividend, int divisor, boolean expected) {
        assertEquals(expected, checker.isDivisible(dividend, divisor));
    }

    @Test
    void rejectsZeroDivisor() {
        assertThrows(IllegalArgumentException.class, () -> checker.isDivisible(1, 0));
    }
}
