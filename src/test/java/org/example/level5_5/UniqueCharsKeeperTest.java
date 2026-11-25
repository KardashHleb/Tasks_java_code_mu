package org.example.level5_5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueCharsKeeperTest {

    @ParameterizedTest
    @CsvSource({"aabbcc, abc", "banana, ban", "'', ''", "abc, abc"})
    void keepsFirstOccurrences(String input, String expected) {
        assertEquals(expected, new UniqueCharsKeeper().keepUnique(input));
    }
}
