package org.example.level1_3;

public class SeasonDeterminer {
    public String determineSeason(byte num) {
        if (num == 12 || num == 1 || num == 2) {
            System.out.println("Зима");
            return "Зима";
        } else if (num >= 3 && num <= 5) {
            System.out.println("Весна");
            return "Весна";
        } else if (num >= 6 && num <= 8) {
            System.out.println("Лето");
            return "Лето";
        } else if (num >= 9 && num <= 11) {
            System.out.println("Осень");
            return "Осень";
        } else {
            System.out.println("Некорректный номер месяца");
            return "Некорректный номер месяца";
        }
    }
}
