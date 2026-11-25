package org.example.level6_8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateZeroPadderTest {

    private final DateZeroPadder padder = new DateZeroPadder();

    @ParameterizedTest
    @CsvSource({"2025-1-5, 2025-01-05", "2025-12-31, 2025-12-31", "2024-2-29, 2024-02-29", "2025-03-7, 2025-03-07"})
    void padsDate(String input, String expected) {
        assertEquals(expected, padder.pad(input));
    }

    @Test
    void rejectsInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> padder.pad("2025-13-1"));
        assertThrows(IllegalArgumentException.class, () -> padder.pad("2025/1/5"));
        assertThrows(IllegalArgumentException.class, () -> padder.pad("2023-2-29"));
    }
}
