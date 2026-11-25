package org.example.level1_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SeasonDeterminerTest {

    private final SeasonDeterminer determiner = new SeasonDeterminer();

    @ParameterizedTest
    @CsvSource({"1, Winter", "12, Winter", "3, Spring", "7, Summer", "11, Autumn"})
    void determinesSeason(int month, String expected) {
        assertEquals(expected, determiner.determineSeason(month));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 13, -1})
    void rejectsInvalidMonth(int month) {
        assertThrows(IllegalArgumentException.class, () -> determiner.determineSeason(month));
    }
}
