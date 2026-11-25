package org.example.level5_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XPyramidTest {

    @Test
    void buildsFiveRows() {
        assertEquals("x\nxx\nxxx\nxxxx\nxxxxx", new XPyramid().build());
    }
}
