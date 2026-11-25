package org.example.level4_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortWordsUpperTest {

    private final ShortWordsUpper task = new ShortWordsUpper();

    @Test
    void upperCasesShortWords() {
        assertEquals("THE quick FOX IS ON fire", task.convert("the quick fox is on fire"));
    }

    @Test
    void fourLetterWordStaysAsIs() {
        assertEquals("four", task.convert("four"));
    }

    @Test
    void emptyString() {
        assertEquals("", task.convert(""));
    }
}
