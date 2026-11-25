package org.example.level1_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PowersOfTwoGeneratorTest {

    private final PowersOfTwoGenerator generator = new PowersOfTwoGenerator();

    @Test
    void firstFivePowers() {
        assertArrayEquals(new long[] {2, 4, 8, 16, 32}, generator.powersOfTwo(5));
    }

    @Test
    void zeroCount() {
        assertEquals(0, generator.powersOfTwo(0).length);
    }

    @Test
    void largestAllowed() {
        assertEquals(1L << 62, generator.powersOfTwo(62)[61]);
    }

    @Test
    void rejectsNegative() {
        assertThrows(IllegalArgumentException.class, () -> generator.powersOfTwo(-1));
    }
}
