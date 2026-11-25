package org.example.level4_9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EveryThirdCharRemoverTest {

    private final EveryThirdCharRemover task = new EveryThirdCharRemover();

    @ParameterizedTest
    @CsvSource({"abcdefgh, abdegh", "ab, ab", "'', ''"})
    void removesEveryThird(String input, String expected) {
        assertEquals(expected, task.remove(input));
    }
}
