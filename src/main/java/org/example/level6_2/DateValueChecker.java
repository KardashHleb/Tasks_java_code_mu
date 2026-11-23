package org.example.level6_2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateValueChecker {
    public boolean isCorrect(String date) {
        System.out.println("Введите дату в формате год-месяц-день");
        System.out.println(date);

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
