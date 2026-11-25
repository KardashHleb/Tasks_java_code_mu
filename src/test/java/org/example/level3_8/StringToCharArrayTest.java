package org.example.level3_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StringToCharArrayTest {

    private final StringToCharArray task = new StringToCharArray();

    @Test
    void splitsIntoChars() {
        assertArrayEquals(new char[]{'a', 'b', 'c'}, task.toChars("abc"));
    }

    @Test
    void emptyString() {
        assertArrayEquals(new char[0], task.toChars(""));
    }
}
