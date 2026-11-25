package org.example.level4_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstWordsTest {

    private final FirstWords task = new FirstWords();

    @Test
    void takesFirstWords() {
        assertEquals("one two", task.takeFirst("one two three four", 2));
    }

    @Test
    void countLargerThanWordCount() {
        assertEquals("one two", task.takeFirst(" one  two ", 5));
    }

    @Test
    void zeroCount() {
        assertEquals("", task.takeFirst("one two", 0));
    }

    @Test
    void negativeCountIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.takeFirst("one", -1));
    }
}
