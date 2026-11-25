package org.example.level6_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongWordsRemoverTest {

    @ParameterizedTest
    @CsvSource({
            "'the cat sat on a mattress', 'the cat sat on a'",
            "'  big  elephant ', 'big'",
            "'enormous', ''",
            "'', ''"
    })
    void removesLongWords(String input, String expected) {
        assertEquals(expected, new LongWordsRemover().remove(input));
    }
}
