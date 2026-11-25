package org.example.level6_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairedNumbersStringTest {

    @Test
    void buildsPairs() {
        assertEquals("12 34 56 78", new PairedNumbersString().build());
    }
}
