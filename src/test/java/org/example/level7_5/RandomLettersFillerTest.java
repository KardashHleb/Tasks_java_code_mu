package org.example.level7_5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;

class RandomLettersFillerTest {

    private final RandomLettersFiller task = new RandomLettersFiller();

    @Test
    void returnsTenLowercaseLetters() {
        char[] result = task.fill(new Random(3));
        assertEquals(10, result.length);
        for (char letter : result) {
            assertTrue(letter >= 'a' && letter <= 'z');
        }
    }

    @Test
    void sameSeedGivesSameLetters() {
        assertArrayEquals(task.fill(new Random(5)), task.fill(new Random(5)));
    }
}
