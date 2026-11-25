package org.example.level5_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayToLinesTest {

    private final ArrayToLines joiner = new ArrayToLines();

    @Test
    void joinsWithNewLines() {
        assertEquals("a\nbb\nccc", joiner.join(new String[]{"a", "bb", "ccc"}));
    }

    @Test
    void emptyArray() {
        assertEquals("", joiner.join(new String[0]));
    }
}
