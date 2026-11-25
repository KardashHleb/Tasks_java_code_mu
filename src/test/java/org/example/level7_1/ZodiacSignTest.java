package org.example.level7_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ZodiacSignTest {

    private final ZodiacSign task = new ZodiacSign();

    @ParameterizedTest
    @CsvSource({
            "2024-01-01, Capricorn", "2024-12-22, Capricorn", "2024-12-21, Sagittarius",
            "2024-03-21, Aries", "2024-07-23, Leo", "2024-11-21, Scorpio"
    })
    void returnsSign(String date, String expected) {
        assertEquals(expected, task.sign(date));
    }

    @Test
    void rejectsInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> task.sign("2024-13-01"));
    }
}
