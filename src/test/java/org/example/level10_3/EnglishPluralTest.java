package org.example.level10_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EnglishPluralTest {

    private final EnglishPlural task = new EnglishPlural();

    @ParameterizedTest
    @CsvSource({
            "cat, cats",
            "box, boxes",
            "bus, buses",
            "church, churches",
            "city, cities",
            "day, days",
            "knife, knives",
            "leaf, leaves",
            "cliff, cliffs",
            "Fox, Foxes"
    })
    void buildsPlural(String noun, String expected) {
        assertEquals(expected, task.plural(noun));
    }

    @Test
    void rejectsEmptyNoun() {
        assertThrows(IllegalArgumentException.class, () -> task.plural(""));
    }
}
