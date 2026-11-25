package org.example.level3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class WordsFromStringTest {

    private final WordsFromString task = new WordsFromString();

    @Test
    void splitsIntoWords() {
        assertArrayEquals(new String[]{"abc", "def", "ghi"}, task.toWords("abc def ghi"));
    }

    @Test
    void extraSpacesAreIgnored() {
        assertArrayEquals(new String[]{"one", "two"}, task.toWords("  one   two "));
    }

    @Test
    void blankStringGivesNoWords() {
        assertArrayEquals(new String[0], task.toWords("   "));
    }
}
