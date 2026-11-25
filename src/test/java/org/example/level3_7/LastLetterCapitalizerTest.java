package org.example.level3_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastLetterCapitalizerTest {

    private final LastLetterCapitalizer task = new LastLetterCapitalizer();

    @Test
    void capitalizesLastLetters() {
        assertEquals("abC deF", task.capitalizeLastLetters("abc def"));
    }

    @Test
    void singleLetterWordsAndExtraSpaces() {
        assertEquals("A B", task.capitalizeLastLetters("  a   b "));
    }

    @Test
    void emptyString() {
        assertEquals("", task.capitalizeLastLetters(""));
    }
}
