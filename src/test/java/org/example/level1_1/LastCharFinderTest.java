package org.example.level1_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LastCharFinderTest {

    private final LastCharFinder finder = new LastCharFinder();

    @Test
    void lastCharOfWord() {
        assertEquals('o', finder.lastChar("hello"));
    }

    @Test
    void singleChar() {
        assertEquals('x', finder.lastChar("x"));
    }

    @Test
    void rejectsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> finder.lastChar(""));
    }
}
