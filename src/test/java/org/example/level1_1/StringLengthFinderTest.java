package org.example.level1_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringLengthFinderTest {

    private final StringLengthFinder finder = new StringLengthFinder();

    @Test
    void lengthOfWord() {
        assertEquals(5, finder.length("hello"));
    }

    @Test
    void emptyString() {
        assertEquals(0, finder.length(""));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> finder.length(null));
    }
}
