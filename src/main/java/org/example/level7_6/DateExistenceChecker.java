package org.example.level7_6;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateExistenceChecker {
    public boolean exists(String date) {
        try {
            LocalDate.parse(date);
            System.out.println("Дата существует");
            return true;
        } catch (DateTimeParseException exception) {
            System.out.println("Дата не существует");
            return false;
        }
    }
}
