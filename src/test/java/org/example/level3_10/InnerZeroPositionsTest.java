package org.example.level3_10;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InnerZeroPositionsTest {

    private final InnerZeroPositions task = new InnerZeroPositions();

    @Test
    void skipsFirstAndLastZero() {
        // digits: 1 0 2 0 3 3 0 4 5 0 6 -> zeros at 1, 3, 6, 9
        assertEquals(List.of(3, 6), task.findInnerZeros(10203304506L));
    }

    @Test
    void twoZerosLeaveNothing() {
        assertEquals(List.of(), task.findInnerZeros(1001));
    }

    @Test
    void noZeros() {
        assertEquals(List.of(), task.findInnerZeros(-123));
    }
}
