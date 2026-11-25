package org.example.level4_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OneToNineStringTest {

    @Test
    void makesDigits() {
        assertEquals("123456789", new OneToNineString().make());
    }
}
