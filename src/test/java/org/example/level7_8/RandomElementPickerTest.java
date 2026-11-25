package org.example.level7_8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import java.util.Set;
import org.junit.jupiter.api.Test;

class RandomElementPickerTest {

    private final RandomElementPicker task = new RandomElementPicker();

    @Test
    void picksAnElementOfTheArray() {
        Random random = new Random(2);
        for (int i = 0; i < 50; i++) {
            assertTrue(Set.of(4, 8, 15).contains(task.pick(new int[] {4, 8, 15}, random)));
        }
    }

    @Test
    void singleElementIsAlwaysPicked() {
        assertEquals(42, task.pick(new int[] {42}));
    }

    @Test
    void rejectsEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> task.pick(new int[0]));
    }
}
