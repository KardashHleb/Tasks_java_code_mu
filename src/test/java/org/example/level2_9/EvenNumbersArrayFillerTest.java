package org.example.level2_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenNumbersArrayFillerTest {

    @Test
    void fillsEvenNumbers() {
        int[] arr = new EvenNumbersArrayFiller().fill();
        assertEquals(50, arr.length);
        assertEquals(2, arr[0]);
        assertEquals(100, arr[49]);
        for (int i = 1; i < arr.length; i++) {
            assertEquals(arr[i - 1] + 2, arr[i]);
        }
    }
}
