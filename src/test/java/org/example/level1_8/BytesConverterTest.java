package org.example.level1_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BytesConverterTest {

    private final BytesConverter converter = new BytesConverter();

    @Test
    void convertsOneGigabyteOfBytes() {
        BytesConverter.Sizes sizes = converter.convert(1_073_741_824L);
        assertEquals(1.0, sizes.gigabytes());
        assertEquals(1024.0, sizes.megabytes());
        assertEquals(1_048_576.0, sizes.kilobytes());
    }

    @Test
    void zeroBytes() {
        assertEquals(new BytesConverter.Sizes(0, 0, 0), converter.convert(0));
    }

    @Test
    void rejectsNegative() {
        assertThrows(IllegalArgumentException.class, () -> converter.convert(-1));
    }
}
