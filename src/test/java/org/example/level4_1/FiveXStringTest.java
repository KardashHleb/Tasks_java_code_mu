package org.example.level4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FiveXStringTest {

    @Test
    void makesFiveX() {
        assertEquals("xxxxx", new FiveXString().make());
    }
}
