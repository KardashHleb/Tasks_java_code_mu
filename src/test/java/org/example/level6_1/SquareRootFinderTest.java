package org.example.level6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareRootFinderTest {

    private final SquareRootFinder finder = new SquareRootFinder();

    @Test
    void findsRoot() {
        assertEquals(5.0, finder.find(25), 1e-9);
        assertEquals(0.0, finder.find(0), 1e-9);
    }

    @Test
    void rejectsNegative() {
        assertThrows(IllegalArgumentException.class, () -> finder.find(-4));
    }
}
