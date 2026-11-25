package org.example.level4_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PixelSizesSumTest {

    private final PixelSizesSum task = new PixelSizesSum();

    @Test
    void addsSizes() {
        assertEquals("27px", task.sum("12px", "15px"));
    }

    @Test
    void zeroSize() {
        assertEquals("5px", task.sum("0px", "5px"));
    }

    @Test
    void malformedSizeIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.sum("12", "15px"));
        assertThrows(IllegalArgumentException.class, () -> task.sum("12em", "15px"));
    }
}
