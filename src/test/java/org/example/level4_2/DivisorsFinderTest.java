package org.example.level4_2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisorsFinderTest {

    private final DivisorsFinder finder = new DivisorsFinder();

    @Test
    void findsDivisors() {
        assertEquals(List.of(1, 2, 3, 4, 6, 12), finder.findDivisors(12));
    }

    @Test
    void oneAndNegative() {
        assertEquals(List.of(1), finder.findDivisors(1));
        assertEquals(List.of(1, 7), finder.findDivisors(-7));
    }

    @Test
    void zeroIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> finder.findDivisors(0));
    }
}
