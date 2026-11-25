package org.example.level7_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstLettersUpperTest {

    private final FirstLettersUpper task = new FirstLettersUpper();

    @Test
    void collectsUpperCasedInitials() {
        assertEquals("HBW", task.initials("hello big world"));
    }

    @Test
    void ignoresExtraSpaces() {
        assertEquals("AB", task.initials("  alpha   beta "));
    }

    @Test
    void handlesEmptyText() {
        assertEquals("", task.initials(""));
    }
}
