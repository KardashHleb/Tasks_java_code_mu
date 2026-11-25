package org.example.level3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HyphenReplacerTest {

    private final HyphenReplacer task = new HyphenReplacer();

    @Test
    void replacesAllHyphens() {
        assertEquals("one two three", task.replaceHyphens("one-two-three"));
    }

    @Test
    void stringWithoutHyphensIsUnchanged() {
        assertEquals("plain", task.replaceHyphens("plain"));
    }

    @Test
    void emptyString() {
        assertEquals("", task.replaceHyphens(""));
    }
}
