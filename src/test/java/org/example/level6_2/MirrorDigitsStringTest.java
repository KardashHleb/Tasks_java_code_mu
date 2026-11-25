package org.example.level6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MirrorDigitsStringTest {

    @Test
    void buildsMirror() {
        assertEquals("12345 54321", new MirrorDigitsString().build());
    }
}
