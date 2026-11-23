package org.example.level6_6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysUntilBirthday {
    public long count(String birthDate) {
        System.out.println("Введите дату рождения");
        System.out.println(birthDate);

        LocalDate birth = LocalDate.parse(birthDate);
        LocalDate today = LocalDate.now();
        LocalDate next = birthdayInYear(today.getYear(), birth.getMonthValue(), birth.getDayOfMonth());

        if (next.isBefore(today)) {
            next = birthdayInYear(today.getYear() + 1, birth.getMonthValue(), birth.getDayOfMonth());
        }

        long result = ChronoUnit.DAYS.between(today, next);
        System.out.println(result);
        return result;
    }

    private LocalDate birthdayInYear(int year, int month, int day) {
        if (month == 2 && day == 29 && !isLeap(year)) {
            return LocalDate.of(year, 2, 28);
        }
        return LocalDate.of(year, month, day);
    }

    private boolean isLeap(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
