package org.example.level6_5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PythagoreanCheckerTest {

    private final PythagoreanChecker checker = new PythagoreanChecker();

    @ParameterizedTest
    @CsvSource({"3, 4, 5, true", "5, 3, 4, true", "5, 12, 13, true", "2, 3, 4, false", "1, 1, 1, false"})
    void checksTriple(int a, int b, int c, boolean expected) {
        assertEquals(expected, checker.isTriple(a, b, c));
    }

    @Test
    void rejectsNonPositive() {
        assertThrows(IllegalArgumentException.class, () -> checker.isTriple(0, 4, 4));
    }
}
