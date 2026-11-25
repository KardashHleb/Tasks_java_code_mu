package org.example.level9_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TextWidthWrapperTest {

    private final TextWidthWrapper task = new TextWidthWrapper();

    @Test
    void wrapsBetweenWords() {
        assertEquals("the quick\nbrown fox\njumps", task.wrap("the quick brown fox jumps", 10));
    }

    @Test
    void longWordGetsOwnLine() {
        assertEquals("a\nverylongword\nb", task.wrap("a verylongword b", 5));
    }

    @Test
    void defaultWidthIsSeventy() {
        String text = "word ".repeat(40);
        for (String line : task.wrap(text).split("\n")) {
            assertTrue(line.length() <= 70);
        }
        assertEquals("", task.wrap("   "));
    }

    @Test
    void rejectsNonPositiveWidth() {
        assertThrows(IllegalArgumentException.class, () -> task.wrap("text", 0));
    }
}
