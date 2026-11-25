package org.example.level1_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FirstTwoLettersCheckerTest {

    private final FirstTwoLettersChecker checker = new FirstTwoLettersChecker();

    @Test
    void sameStart() {
        assertTrue(checker.haveSameFirstTwoLetters("apple", "apricot"));
    }

    @Test
    void differentStart() {
        assertFalse(checker.haveSameFirstTwoLetters("apple", "banana"));
    }

    @Test
    void caseSensitive() {
        assertFalse(checker.haveSameFirstTwoLetters("Apple", "apple"));
    }

    @Test
    void rejectsShortWord() {
        assertThrows(IllegalArgumentException.class, () -> checker.haveSameFirstTwoLetters("a", "apple"));
    }
}
