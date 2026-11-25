package org.example.level7_8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Random;
import org.junit.jupiter.api.Test;

class NonRepeatingElementPickerTest {

    @Test
    void consecutivePicksDiffer() {
        NonRepeatingElementPicker picker = new NonRepeatingElementPicker(new Random(1));
        int[] values = {1, 2, 3};
        int previous = picker.pick(values);
        for (int i = 0; i < 200; i++) {
            int current = picker.pick(values);
            assertNotEquals(previous, current);
            previous = current;
        }
    }

    @Test
    void repeatsWhenNoOtherValueExists() {
        NonRepeatingElementPicker picker = new NonRepeatingElementPicker(new Random(1));
        assertEquals(5, picker.pick(new int[] {5, 5}));
        assertEquals(5, picker.pick(new int[] {5, 5}));
    }

    @Test
    void rejectsEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> new NonRepeatingElementPicker().pick(new int[0]));
    }
}
