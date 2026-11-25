package org.example.level5_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RisingDigitPyramidTest {

    @Test
    void buildsRisingPyramid() {
        assertEquals("1\n22\n333\n4444\n55555", new RisingDigitPyramid().build());
    }
}
