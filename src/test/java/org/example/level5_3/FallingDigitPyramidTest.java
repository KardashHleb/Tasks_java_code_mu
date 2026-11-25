package org.example.level5_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FallingDigitPyramidTest {

    @Test
    void buildsFallingPyramid() {
        assertEquals("55555\n4444\n333\n22\n1", new FallingDigitPyramid().build());
    }
}
