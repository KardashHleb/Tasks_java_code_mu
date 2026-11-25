package org.example.level5_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenXPyramidTest {

    @Test
    void buildsEvenRows() {
        assertEquals("xx\nxxxx\nxxxxxx\nxxxxxxxx\nxxxxxxxxxx", new EvenXPyramid().build());
    }
}
