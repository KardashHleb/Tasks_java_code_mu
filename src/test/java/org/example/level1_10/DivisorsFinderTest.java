package org.example.level1_10;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisorsFinderTest {

    private final DivisorsFinder finder = new DivisorsFinder();

    @Test
    void divisorsOfTwelve() {
        assertIterableEquals(List.of(1, 2, 3, 4, 6, 12), finder.findDivisors(12));
    }

    @Test
    void divisorsOfOne() {
        assertIterableEquals(List.of(1), finder.findDivisors(1));
    }

    @Test
    void divisorsOfPrime() {
        assertIterableEquals(List.of(1, 13), finder.findDivisors(13));
    }

    @Test
    void rejectsZero() {
        assertThrows(IllegalArgumentException.class, () -> finder.findDivisors(0));
    }
}
