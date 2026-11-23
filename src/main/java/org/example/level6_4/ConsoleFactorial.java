package org.example.level6_4;

public class ConsoleFactorial {
    public long factorial(int number) {
        System.out.println("Введите целое число");
        System.out.println(number);

        if (number < 0) {
            System.out.println("Факториал отрицательного числа не определен");
            return -1;
        }

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        System.out.println(result);
        return result;
    }
}
