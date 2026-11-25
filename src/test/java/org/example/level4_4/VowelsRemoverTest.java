package org.example.level4_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelsRemoverTest {

    private final VowelsRemover task = new VowelsRemover();

    @ParameterizedTest
    @CsvSource({"Hello World, Hll Wrld", "AEIOUaeiou, ''", "rhythm, rhythm", "'', ''"})
    void removesVowels(String input, String expected) {
        assertEquals(expected, task.removeVowels(input));
    }
}
