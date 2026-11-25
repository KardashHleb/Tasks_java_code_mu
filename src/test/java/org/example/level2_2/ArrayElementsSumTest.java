package org.example.level2_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayElementsSumTest {

    private final ArrayElementsSum summer = new ArrayElementsSum();

    @Test
    void sumsElements() {
        assertEquals(5, summer.sumElements(new int[] {1, -2, 6}));
    }

    @Test
    void emptyArray() {
        assertEquals(0, summer.sumElements(new int[0]));
    }

    @Test
    void doesNotOverflow() {
        assertEquals(4_294_967_294L, summer.sumElements(new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE}));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> summer.sumElements(null));
    }
}
