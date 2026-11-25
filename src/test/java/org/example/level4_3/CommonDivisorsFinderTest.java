package org.example.level4_3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CommonDivisorsFinderTest {

    private final CommonDivisorsFinder finder = new CommonDivisorsFinder();

    @Test
    void findsCommonDivisors() {
        assertEquals(List.of(1, 2, 3, 6), finder.find(12, 18));
    }

    @Test
    void coprimeAndNegative() {
        assertEquals(List.of(1), finder.find(-8, 9));
    }

    @Test
    void zeroWithOtherNumber() {
        assertEquals(List.of(1, 5), finder.find(0, 5));
    }

    @Test
    void bothZeroIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> finder.find(0, 0));
    }
}
