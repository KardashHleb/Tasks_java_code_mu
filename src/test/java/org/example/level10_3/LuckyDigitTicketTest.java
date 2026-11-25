package org.example.level10_3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LuckyDigitTicketTest {

    private final LuckyDigitTicket task = new LuckyDigitTicket();

    @Test
    void canBeRearranged() {
        assertTrue(task.canBeLucky(new int[]{1, 1, 2, 2, 3, 3}));
        assertTrue(task.canBeLucky(new int[]{9, 0, 0, 4, 5, 0}));
        assertTrue(task.canBeLucky(new int[]{0, 0, 0, 0, 0, 0}));
    }

    @Test
    void cannotBeRearranged() {
        assertFalse(task.canBeLucky(new int[]{0, 0, 0, 0, 0, 1}));
        assertFalse(task.canBeLucky(new int[]{9, 1, 1, 1, 1, 1}));
    }

    @Test
    void rejectsInvalidTickets() {
        assertThrows(IllegalArgumentException.class, () -> task.canBeLucky(new int[]{1, 2, 3}));
        assertThrows(IllegalArgumentException.class, () -> task.canBeLucky(new int[]{1, 2, 3, 4, 5, 10}));
    }
}
