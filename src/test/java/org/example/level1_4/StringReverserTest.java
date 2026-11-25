package org.example.level1_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringReverserTest {

    private final StringReverser reverser = new StringReverser();

    @Test
    void reversesWord() {
        assertEquals("olleh", reverser.reverse("hello"));
    }

    @Test
    void emptyString() {
        assertEquals("", reverser.reverse(""));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> reverser.reverse(null));
    }
}
