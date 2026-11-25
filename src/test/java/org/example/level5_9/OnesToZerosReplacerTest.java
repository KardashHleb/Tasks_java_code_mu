package org.example.level5_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OnesToZerosReplacerTest {

    private final OnesToZerosReplacer replacer = new OnesToZerosReplacer();

    @Test
    void replacesOnes() {
        assertArrayEquals(new String[]{"000", "a0b", "234"}, replacer.replace(new String[]{"101", "a1b", "234"}));
    }

    @Test
    void handlesEmpty() {
        assertArrayEquals(new String[]{""}, replacer.replace(new String[]{""}));
        assertArrayEquals(new String[0], replacer.replace(new String[0]));
    }
}
