package org.example.level4_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountdownStringTest {

    @Test
    void makesCountdown() {
        assertEquals("54321", new CountdownString().make());
    }
}
