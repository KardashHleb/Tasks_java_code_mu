package org.example.level4_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsCapitalizerTest {

    private final WordsCapitalizer task = new WordsCapitalizer();

    @ParameterizedTest
    @CsvSource({"hello big world, Hello Big World", "' a  b', ' A  B'", "'', ''"})
    void capitalizesWords(String input, String expected) {
        assertEquals(expected, task.capitalize(input));
    }
}
