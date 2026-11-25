package org.example.level7_7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WordsSorterTest {

    private final WordsSorter task = new WordsSorter();

    @Test
    void sortsWords() {
        assertEquals("apple banana cherry", task.sort("cherry apple banana"));
    }

    @Test
    void collapsesExtraWhitespace() {
        assertEquals("a b c", task.sort("  c   a b  "));
    }

    @Test
    void handlesBlankText() {
        assertEquals("", task.sort("   "));
    }
}
