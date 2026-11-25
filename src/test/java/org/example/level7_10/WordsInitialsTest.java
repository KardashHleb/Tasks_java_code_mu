package org.example.level7_10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WordsInitialsTest {

    private final WordsInitials task = new WordsInitials();

    @Test
    void collectsUpperCasedInitials() {
        assertEquals("JVM", task.initials("java virtual machine"));
    }

    @Test
    void ignoresExtraSpacesAndEmptyText() {
        assertEquals("OT", task.initials("  one   two "));
        assertEquals("", task.initials(""));
    }
}
