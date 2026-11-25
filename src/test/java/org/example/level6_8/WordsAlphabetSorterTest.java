package org.example.level6_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsAlphabetSorterTest {

    @ParameterizedTest
    @CsvSource({
            "'pear apple orange banana', 'apple banana orange pear'",
            "'  b   a ', 'a b'",
            "'word', 'word'",
            "'', ''"
    })
    void sortsWords(String input, String expected) {
        assertEquals(expected, new WordsAlphabetSorter().sort(input));
    }
}
