package org.example.level3_5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordCounterTest {

    private final WordCounter counter = new WordCounter();

    @ParameterizedTest
    @CsvSource({"'one two three', 3", "'  spaced   out  ', 2", "'', 0", "'   ', 0", "single, 1"})
    void countsWords(String text, int expected) {
        assertEquals(expected, counter.countWords(text));
    }
}
