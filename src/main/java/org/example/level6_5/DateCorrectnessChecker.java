package org.example.level6_5;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateCorrectnessChecker {
    public boolean isCorrect(String date) {
        try {
            LocalDate.parse(date);
            System.out.println("Дата корректна");
            return true;
        } catch (DateTimeParseException exception) {
            System.out.println("Дата некорректна");
            return false;
        }
    }
}
