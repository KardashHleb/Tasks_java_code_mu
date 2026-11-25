package org.example.level10_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountNounTest {

    private final CountNoun task = new CountNoun();

    @ParameterizedTest
    @CsvSource({
            "1, 1 child",
            "-1, -1 child",
            "0, 0 children",
            "2, 2 children",
            "21, 21 children"
    })
    void usesGivenForms(int number, String expected) {
        assertEquals(expected, task.form(number, "child", "children"));
    }

    @Test
    void buildsRegularPlural() {
        assertEquals("1 apple", task.form(1, "apple"));
        assertEquals("5 apples", task.form(5, "apple"));
        assertEquals("3 boxes", task.form(3, "box"));
    }
}
