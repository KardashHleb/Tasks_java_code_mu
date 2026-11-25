package org.example.level9_7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;

class LettersShufflerTest {

    private final LettersShuffler task = new LettersShuffler();

    @Test
    void keepsTheSameLetters() {
        String shuffled = task.shuffle("programming", new Random(7));
        char[] expected = "programming".toCharArray();
        char[] actual = shuffled.toCharArray();
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void isDeterministicForSeed() {
        assertEquals(task.shuffle("abcdef", new Random(3)), task.shuffle("abcdef", new Random(3)));
    }

    @Test
    void handlesShortWords() {
        assertEquals("", task.shuffle("", new Random(1)));
        assertEquals("a", task.shuffle("a", new Random(1)));
    }
}
