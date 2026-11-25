package org.example.level3_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StringsCharsJoinerTest {

    private final StringsCharsJoiner task = new StringsCharsJoiner();

    @Test
    void joinsCharacters() {
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, task.joinChars(new String[]{"ab", "cd", "ef"}));
    }

    @Test
    void emptyStringsContributeNothing() {
        assertArrayEquals(new char[]{'x'}, task.joinChars(new String[]{"", "x", ""}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new char[0], task.joinChars(new String[0]));
    }
}
