package org.example.level5_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TripleDigitsPyramidTest {

    @Test
    void buildsNineRows() {
        assertEquals("111\n222\n333\n444\n555\n666\n777\n888\n999", new TripleDigitsPyramid().build());
    }
}
