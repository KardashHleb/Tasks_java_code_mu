package org.example.level6_5;

import java.time.LocalDate;
import java.time.Period;

public class FullYearsCounter {
    public int count(String birthDate) {
        System.out.println("Введите дату рождения в формате год-месяц-день");
        System.out.println(birthDate);

        LocalDate birth = LocalDate.parse(birthDate);
        int result = Period.between(birth, LocalDate.now()).getYears();
        System.out.println(result);
        return result;
    }
}
