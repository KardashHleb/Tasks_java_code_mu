package org.example.level5_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddDigitsPyramidTest {

    @Test
    void buildsOddRows() {
        assertEquals("1\n333\n55555\n7777777\n999999999", new OddDigitsPyramid().build());
    }
}
