package org.example.level3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LastThreeCharsTest {

    private final LastThreeChars task = new LastThreeChars();

    @Test
    void takesLastThree() {
        assertEquals("def", task.lastThree("abcdef"));
    }

    @Test
    void exactlyThreeChars() {
        assertEquals("abc", task.lastThree("abc"));
    }

    @Test
    void tooShortStringIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.lastThree("ab"));
    }
}
