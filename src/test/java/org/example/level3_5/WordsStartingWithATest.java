package org.example.level3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class WordsStartingWithATest {

    private final WordsStartingWithA task = new WordsStartingWithA();

    @Test
    void collectsWordsStartingWithA() {
        assertArrayEquals(new String[]{"apple", "avocado"}, task.collect("apple banana  avocado cherry"));
    }

    @Test
    void isCaseSensitive() {
        assertArrayEquals(new String[0], task.collect("Apple Avocado"));
    }

    @Test
    void emptyText() {
        assertArrayEquals(new String[0], task.collect(""));
    }
}
