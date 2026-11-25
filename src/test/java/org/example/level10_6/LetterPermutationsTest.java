package org.example.level10_6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class LetterPermutationsTest {

    private final LetterPermutations task = new LetterPermutations();

    @Test
    void generatesAllPermutations() {
        assertEquals(List.of("abc", "acb", "bac", "bca", "cab", "cba"), task.make("abc"));
    }

    @Test
    void skipsDuplicates() {
        assertEquals(List.of("aab", "aba", "baa"), task.make("aab"));
        assertEquals(List.of("zz"), task.make("zz"));
    }

    @Test
    void emptyWordHasOnePermutation() {
        assertEquals(List.of(""), task.make(""));
    }

    @Test
    void rejectsTooLongWord() {
        assertThrows(IllegalArgumentException.class, () -> task.make("abcdefghi"));
    }
}
