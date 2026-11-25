package org.example.level1_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MegabytesToBytesConverterTest {

    private final MegabytesToBytesConverter converter = new MegabytesToBytesConverter();

    @Test
    void convertsMegabytes() {
        assertEquals(3_145_728L, converter.toBytes(3));
    }

    @Test
    void largeValueDoesNotOverflowInt() {
        assertEquals(4_294_967_296L, converter.toBytes(4096));
    }

    @Test
    void rejectsNegative() {
        assertThrows(IllegalArgumentException.class, () -> converter.toBytes(-5));
    }
}
