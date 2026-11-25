package org.example.level10_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import org.junit.jupiter.api.Test;

class RandomWordByLetterTest {

    private final RandomWordByLetter task = new RandomWordByLetter();
    private final List<String> words = List.of("Apple", "banana", "avocado", "cherry", "");

    @Test
    void picksOnlyWordsStartingWithLetter() {
        Random random = new Random(5);
        for (int i = 0; i < 20; i++) {
            String word = task.pick(words, 'a', random).orElseThrow();
            assertTrue(word.equals("Apple") || word.equals("avocado"), word);
        }
        assertEquals(Optional.of("banana"), task.pick(words, 'B', new Random(1)));
    }

    @Test
    void returnsEmptyWhenNothingMatches() {
        assertEquals(Optional.empty(), task.pick(words, 'z', new Random(1)));
    }

    @Test
    void rejectsNonLetter() {
        assertThrows(IllegalArgumentException.class, () -> task.pick(words, '1', new Random(1)));
    }
}
