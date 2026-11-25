package org.example.level4_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateToArrayTest {

    private final DateToArray task = new DateToArray();

    @Test
    void splitsDate() {
        assertArrayEquals(new String[]{"31", "12", "2025"}, task.convert("2025-12-31"));
    }

    @Test
    void keepsLeadingZeros() {
        assertArrayEquals(new String[]{"05", "01", "2024"}, task.convert("2024-01-05"));
    }

    @Test
    void invalidDateIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.convert("31-12-2025"));
        assertThrows(IllegalArgumentException.class, () -> task.convert("2025-02-30"));
    }
}
