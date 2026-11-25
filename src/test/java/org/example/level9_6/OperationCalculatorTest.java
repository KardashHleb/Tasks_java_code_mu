package org.example.level9_6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class OperationCalculatorTest {

    private final OperationCalculator task = new OperationCalculator();

    @ParameterizedTest
    @CsvSource({
            "'2 + 3', 5",
            "'10-4', 6",
            "' -6 * 7 ', -42",
            "'7 / 2', 3",
            "'5 - -5', 10"
    })
    void evaluatesExpression(String expression, int expected) {
        assertEquals(expected, task.calculate(expression));
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> task.calculate("1 / 0"));
    }

    @Test
    void rejectsMalformedExpression() {
        assertThrows(IllegalArgumentException.class, () -> task.calculate("2 ^ 3"));
        assertThrows(IllegalArgumentException.class, () -> task.calculate(""));
    }
}
