package org.example.level2_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareRootsSumTest {

    private final SquareRootsSum summer = new SquareRootsSum();

    @Test
    void sumsRoots() {
        assertEquals(9.0, summer.sumSquareRoots(new int[] {4, 9, 16}));
    }

    @Test
    void emptyArray() {
        assertEquals(0.0, summer.sumSquareRoots(new int[0]));
    }

    @Test
    void rejectsNegativeElement() {
        assertThrows(IllegalArgumentException.class, () -> summer.sumSquareRoots(new int[] {4, -1}));
    }
}
