package org.example.level8_7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class GrowingDigitStringsTest {

    @Test
    void buildsGrowingDigitRows() {
        assertArrayEquals(new String[] {"1", "12", "123", "1234", "12345"}, new GrowingDigitStrings().make());
    }
}
