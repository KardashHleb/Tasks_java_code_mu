package org.example.level5_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumberInRangeReaderTest {

    private final NumberInRangeReader reader = new NumberInRangeReader();

    @Test
    void returnsFirstAttemptInRange() {
        assertEquals(7, reader.read(0, 15, 7, 3));
    }

    @Test
    void acceptsBoundaries() {
        assertEquals(1, reader.read(1));
        assertEquals(10, reader.read(11, 10));
    }

    @Test
    void throwsWhenNoAttemptFits() {
        assertThrows(IllegalArgumentException.class, () -> reader.read(0, -3, 11));
    }
}
