package org.example.level5_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonCharsKeeperTest {

    @ParameterizedTest
    @CsvSource({"abcdef, xbzd, bd", "hello, world, lo", "abc, xyz, ''", "'', abc, ''"})
    void keepsCommonCharacters(String first, String second, String expected) {
        assertEquals(expected, new CommonCharsKeeper().keep(first, second));
    }
}
