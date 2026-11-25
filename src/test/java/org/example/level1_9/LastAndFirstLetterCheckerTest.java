package org.example.level1_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LastAndFirstLetterCheckerTest {

    private final LastAndFirstLetterChecker checker = new LastAndFirstLetterChecker();

    @Test
    void lettersMatch() {
        assertTrue(checker.lastMatchesFirst("apple", "egg"));
    }

    @Test
    void lettersDiffer() {
        assertFalse(checker.lastMatchesFirst("apple", "banana"));
    }

    @Test
    void singleLetterWords() {
        assertTrue(checker.lastMatchesFirst("a", "a"));
    }

    @Test
    void rejectsEmptyWord() {
        assertThrows(IllegalArgumentException.class, () -> checker.lastMatchesFirst("", "egg"));
    }
}
