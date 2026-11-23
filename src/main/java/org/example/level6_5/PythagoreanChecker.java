package org.example.level6_5;

public class PythagoreanChecker {
    public boolean isTriple(int first, int second, int third) {
        System.out.println("Введите три числа");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }

        long squares = (long) first * first + (long) second * second + (long) third * third;
        long maxSquare = (long) max * max;
        boolean triple = maxSquare == squares - maxSquare;

        if (triple) {
            System.out.println("Тройка Пифагора");
        } else {
            System.out.println("Не тройка Пифагора");
        }
        return triple;
    }
}
