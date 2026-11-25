package org.example.level7_6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;

class RandomLettersStringTest {

    private final RandomLettersString task = new RandomLettersString();

    @Test
    void producesLowercaseLettersOfRequestedLength() {
        String result = task.make(50, new Random(11));
        assertEquals(50, result.length());
        assertTrue(result.matches("[a-z]+"));
    }

    @Test
    void zeroLengthGivesEmptyString() {
        assertEquals("", task.make(0));
    }

    @Test
    void rejectsNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> task.make(-2));
    }
}
