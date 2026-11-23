package org.example.level2_9;

public class DayTypeDeterminer {
    public String determine(byte num) {
        if (num >= 1 && num <= 5) {
            System.out.println("Будний");
            return "Будний";
        } else if (num == 6 || num == 7) {
            System.out.println("Выходной");
            return "Выходной";
        } else {
            System.out.println("Некорректный номер дня");
            return "Некорректный номер дня";
        }
    }
}
