package org.example.level2_10;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CommonDivisorsFinderTest {

    private final CommonDivisorsFinder finder = new CommonDivisorsFinder();

    @Test
    void commonDivisorsOf12And18() {
        assertIterableEquals(List.of(1, 2, 3, 6), finder.findCommonDivisors(12, 18));
    }

    @Test
    void perfectSquareGcd() {
        assertIterableEquals(List.of(1, 2, 4, 8, 16), finder.findCommonDivisors(32, 48));
    }

    @Test
    void coprimeNumbers() {
        assertIterableEquals(List.of(1), finder.findCommonDivisors(7, 9));
    }

    @Test
    void rejectsNonPositive() {
        assertThrows(IllegalArgumentException.class, () -> finder.findCommonDivisors(0, 5));
    }
}
