package org.example.level1_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CharsFromEndCollectorTest {

    private final CharsFromEndCollector collector = new CharsFromEndCollector();

    @Test
    void collectsFromEnd() {
        assertArrayEquals(new char[] {'c', 'b', 'a'}, collector.charsFromEnd("abc"));
    }

    @Test
    void emptyString() {
        assertArrayEquals(new char[0], collector.charsFromEnd(""));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> collector.charsFromEnd(null));
    }
}
