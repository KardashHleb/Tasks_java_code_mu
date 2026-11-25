package org.example.level9_10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MiddleBlankRemoverTest {

    private final MiddleBlankRemover task = new MiddleBlankRemover();

    @Test
    void removesInnerEmptyLinesOnly() {
        assertEquals("\none\ntwo\nthree\n\n", task.clean("\none\n\n\ntwo\n\nthree\n\n"));
    }

    @Test
    void keepsTextWithoutEmptyLines() {
        assertEquals("a\nb", task.clean("a\nb"));
    }

    @Test
    void handlesEmptyAndBlankText() {
        assertEquals("", task.clean(""));
        assertEquals("\n\n", task.clean("\n\n"));
    }
}
