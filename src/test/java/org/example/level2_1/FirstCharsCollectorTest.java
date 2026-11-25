package org.example.level2_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstCharsCollectorTest {

    private final FirstCharsCollector collector = new FirstCharsCollector();

    @Test
    void collectsFirstChars() {
        assertArrayEquals(new char[] {'a', 'b', 'c'}, collector.firstChars(new String[] {"apple", "banana", "cherry"}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new char[0], collector.firstChars(new String[0]));
    }

    @Test
    void rejectsEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> collector.firstChars(new String[] {"apple", ""}));
    }
}
