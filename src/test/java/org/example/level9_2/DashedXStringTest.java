package org.example.level9_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DashedXStringTest {

    private final DashedXString task = new DashedXString();

    @Test
    void buildsDefaultString() {
        assertEquals("-x-xx-xxx-xx-x-", task.make());
    }

    @Test
    void buildsForOtherPeaks() {
        assertEquals("-x-", task.make(1));
        assertEquals("-x-xx-x-", task.make(2));
    }

    @Test
    void rejectsNonPositivePeak() {
        assertThrows(IllegalArgumentException.class, () -> task.make(0));
    }
}
