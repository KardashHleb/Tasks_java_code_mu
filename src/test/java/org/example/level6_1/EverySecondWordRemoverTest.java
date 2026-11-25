package org.example.level6_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EverySecondWordRemoverTest {

    @ParameterizedTest
    @CsvSource({
            "'one two three four five', 'one three five'",
            "'  one   two three ', 'one three'",
            "'single', 'single'",
            "'', ''"
    })
    void removesEverySecondWord(String input, String expected) {
        assertEquals(expected, new EverySecondWordRemover().remove(input));
    }
}
