package org.example.level9_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LongestWordTest {

    private final LongestWord task = new LongestWord();

    @ParameterizedTest
    @CsvSource({
            "'The quick brown fox, jumped!', jumped",
            "'one two six', one",
            "word, word",
            "'', ''",
            "' ,.! ', ''"
    })
    void findsLongestWord(String text, String expected) {
        assertEquals(expected, task.find(text));
    }
}
