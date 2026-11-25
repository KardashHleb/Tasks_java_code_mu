package org.example.level2_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PositiveLessThanTenSumTest {

    private final PositiveLessThanTenSum summer = new PositiveLessThanTenSum();

    @Test
    void sumsOnlyInRange() {
        assertEquals(10, summer.sumInRange(new int[] {1, 10, 9, 0, -3, 25}));
    }

    @Test
    void emptyArray() {
        assertEquals(0, summer.sumInRange(new int[0]));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> summer.sumInRange(null));
    }
}
