package org.example.level2_8;

public class MonthNameShower {
    public String showMonth(byte num) {
        String[] months = {
                "Январь", "Февраль", "Март", "Апрель",
                "Май", "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };

        if (num >= 1 && num <= 12) {
            String month = months[num - 1];
            System.out.println(month);
            return month;
        }

        System.out.println("Некорректный номер месяца");
        return "Некорректный номер месяца";
    }
}
