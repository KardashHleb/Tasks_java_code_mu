package org.example.level6_1;

public class SquareRootFinder {
    public double find(double number) {
        System.out.println("Введите число");
        System.out.println(number);

        if (number < 0) {
            System.out.println("Квадратный корень из отрицательного числа не вычисляется");
            return -1;
        }

        double result = Math.sqrt(number);
        System.out.println(result);
        return result;
    }
}
