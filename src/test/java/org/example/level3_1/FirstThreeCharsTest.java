package org.example.level3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstThreeCharsTest {

    private final FirstThreeChars task = new FirstThreeChars();

    @Test
    void takesFirstThree() {
        assertEquals("abc", task.firstThree("abcdef"));
    }

    @Test
    void exactlyThreeChars() {
        assertEquals("xyz", task.firstThree("xyz"));
    }

    @Test
    void tooShortStringIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.firstThree("ab"));
    }
}
