package org.example.level10_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PasswordMakerTest {

    private final PasswordMaker task = new PasswordMaker();

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 16})
    void containsEveryCharacterClass(int length) {
        Random random = new Random(length);
        for (int i = 0; i < 20; i++) {
            String password = task.make(length, random);
            assertEquals(length, password.length());
            assertTrue(containsAny(password, PasswordMaker.LOWER), password);
            assertTrue(containsAny(password, PasswordMaker.UPPER), password);
            assertTrue(containsAny(password, PasswordMaker.DIGITS), password);
            assertTrue(containsAny(password, PasswordMaker.SPECIAL), password);
            String allowed = PasswordMaker.LOWER + PasswordMaker.UPPER + PasswordMaker.DIGITS + PasswordMaker.SPECIAL;
            assertTrue(password.chars().allMatch(c -> allowed.indexOf(c) >= 0), password);
        }
    }

    @Test
    void isDeterministicForSeed() {
        assertEquals(task.make(10, new Random(9)), task.make(10, new Random(9)));
    }

    @Test
    void rejectsTooShortLength() {
        assertThrows(IllegalArgumentException.class, () -> task.make(3, new Random(1)));
    }

    private static boolean containsAny(String text, String chars) {
        return text.chars().anyMatch(c -> chars.indexOf(c) >= 0);
    }
}
