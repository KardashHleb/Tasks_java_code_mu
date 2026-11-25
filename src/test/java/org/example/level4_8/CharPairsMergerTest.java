package org.example.level4_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CharPairsMergerTest {

    private final CharPairsMerger task = new CharPairsMerger();

    @Test
    void mergesPairs() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, task.merge(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new String[0], task.merge(new char[0]));
    }

    @Test
    void oddLengthIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.merge(new char[]{'a', 'b', 'c'}));
    }
}
