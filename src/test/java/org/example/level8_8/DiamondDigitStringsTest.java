package org.example.level8_8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DiamondDigitStringsTest {

    @Test
    void buildsDiamondRows() {
        String[] expected = {"1", "12", "123", "1234", "12345", "1234", "123", "12", "1"};
        assertArrayEquals(expected, new DiamondDigitStrings().make());
    }
}
