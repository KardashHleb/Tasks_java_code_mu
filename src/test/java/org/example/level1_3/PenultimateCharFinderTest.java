package org.example.level1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PenultimateCharFinderTest {

    private final PenultimateCharFinder finder = new PenultimateCharFinder();

    @Test
    void penultimateOfWord() {
        assertEquals('l', finder.penultimateChar("hello"));
    }

    @Test
    void twoChars() {
        assertEquals('a', finder.penultimateChar("ab"));
    }

    @Test
    void rejectsSingleChar() {
        assertThrows(IllegalArgumentException.class, () -> finder.penultimateChar("a"));
    }
}
