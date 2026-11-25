package org.example.level1_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class KilobytesToBytesConverterTest {

    private final KilobytesToBytesConverter converter = new KilobytesToBytesConverter();

    @Test
    void convertsKilobytes() {
        assertEquals(5120, converter.toBytes(5));
    }

    @Test
    void zero() {
        assertEquals(0, converter.toBytes(0));
    }

    @Test
    void rejectsNegative() {
        assertThrows(IllegalArgumentException.class, () -> converter.toBytes(-1));
    }
}
