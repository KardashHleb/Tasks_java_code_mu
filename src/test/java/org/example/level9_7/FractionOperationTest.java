package org.example.level9_7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FractionOperationTest {

    private final FractionOperation task = new FractionOperation();

    @ParameterizedTest
    @CsvSource({
            "'1/2 + 1/3', 5/6",
            "'1/2 - 1/2', 0/1",
            "'2/3 * 3/4', 1/2",
            "'1/2 / -1/4', -2/1",
            "'3 + 1/2', 7/2"
    })
    void calculatesAndReduces(String expression, String expected) {
        assertEquals(expected, task.calculate(expression));
    }

    @Test
    void rejectsZeroDenominatorAndDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> task.calculate("1/0 + 1/2"));
        assertThrows(IllegalArgumentException.class, () -> task.calculate("1/2 / 0/5"));
    }

    @Test
    void rejectsMalformedExpression() {
        assertThrows(IllegalArgumentException.class, () -> task.calculate("one half"));
    }
}
