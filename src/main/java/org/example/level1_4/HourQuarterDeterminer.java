package org.example.level1_4;

public class HourQuarterDeterminer {
    public String determineQuarter(byte num) {
        if (num >= 0 && num <= 15) {
            System.out.println("Первая четверть");
            return "Первая четверть";
        } else if (num >= 16 && num <= 30) {
            System.out.println("Вторая четверть");
            return "Вторая четверть";
        } else if (num >= 31 && num <= 45) {
            System.out.println("Третья четверть");
            return "Третья четверть";
        } else if (num >= 46 && num <= 60) {
            System.out.println("Четвертая четверть");
            return "Четвертая четверть";
        } else {
            System.out.println("Некорректный номер минуты");
            return "Некорректный номер минуты";
        }
    }
}
