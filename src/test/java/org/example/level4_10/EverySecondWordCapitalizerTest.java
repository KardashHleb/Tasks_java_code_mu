package org.example.level4_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EverySecondWordCapitalizerTest {

    private final EverySecondWordCapitalizer task = new EverySecondWordCapitalizer();

    @Test
    void capitalizesEvenWords() {
        assertEquals("one Two three Four", task.capitalize("one two three four"));
    }

    @Test
    void singleWordIsUnchanged() {
        assertEquals("word", task.capitalize("  word "));
    }

    @Test
    void emptyString() {
        assertEquals("", task.capitalize(""));
    }
}
