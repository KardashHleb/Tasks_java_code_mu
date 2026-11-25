package org.example.level1_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GigabytesConverterTest {

    private final GigabytesConverter converter = new GigabytesConverter();

    @Test
    void convertsOneGigabyte() {
        GigabytesConverter.Sizes sizes = converter.convert(1);
        assertEquals(1024.0, sizes.megabytes());
        assertEquals(1_048_576.0, sizes.kilobytes());
        assertEquals(1_073_741_824.0, sizes.bytes());
    }

    @Test
    void convertsFraction() {
        assertEquals(512.0, converter.convert(0.5).megabytes());
    }

    @Test
    void rejectsNegative() {
        assertThrows(IllegalArgumentException.class, () -> converter.convert(-1));
    }
}
