package org.example.level3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ZerosStringMakerTest {

    private final ZerosStringMaker task = new ZerosStringMaker();

    @Test
    void makesZeros() {
        assertEquals("00000", task.makeZeros(5));
    }

    @Test
    void zeroCountGivesEmptyString() {
        assertEquals("", task.makeZeros(0));
    }

    @Test
    void negativeCountIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.makeZeros(-1));
    }
}
