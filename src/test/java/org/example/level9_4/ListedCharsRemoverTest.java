package org.example.level9_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ListedCharsRemoverTest {

    private final ListedCharsRemover task = new ListedCharsRemover();

    @ParameterizedTest
    @CsvSource({
            "hello world, lo, he wrd",
            "abc, '', abc",
            "'', abc, ''",
            "aaa, a, ''"
    })
    void removesListedCharacters(String text, String chars, String expected) {
        assertEquals(expected, task.remove(text, chars));
    }
}
