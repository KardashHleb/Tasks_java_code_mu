package org.example.level4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AllElementsPresentCheckerTest {

    private final AllElementsPresentChecker checker = new AllElementsPresentChecker();

    @Test
    void allPresent() {
        assertTrue(checker.allPresent(new int[]{1, 2, 2}, new int[]{3, 2, 1}));
    }

    @Test
    void missingElement() {
        assertFalse(checker.allPresent(new int[]{1, 4}, new int[]{1, 2, 3}));
    }

    @Test
    void emptyFirstArray() {
        assertTrue(checker.allPresent(new int[0], new int[0]));
    }
}
